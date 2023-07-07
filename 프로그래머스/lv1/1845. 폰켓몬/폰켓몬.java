import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map <Integer, Integer> map = new HashMap<>();
        
        for (int key : nums) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            } else {
                map.put(key, 1);
            }
        }
        
        return answer = map.size() < nums.length/2 ? map.size() : nums.length/2;
    }
}