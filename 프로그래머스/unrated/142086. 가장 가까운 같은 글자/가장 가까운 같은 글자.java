import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int num = 0;
        
        Map <Integer, Character> map = new HashMap<>();
        Map <Character, Integer> compMap = new HashMap<>();
        
        for (int i=0; i<s.length(); i++) {
            map.put(i+1, s.charAt(i));
        }
        
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            if (compMap.get(entry.getValue()) == null) {
                compMap.put(entry.getValue(), num+1);
                answer[num] = -1;
                num++;
            } else {
                answer[num] = entry.getKey() - compMap.get(entry.getValue());
                compMap.put(entry.getValue(), num+1);
                num++;
            }
        }
        
        return answer;
    }
}