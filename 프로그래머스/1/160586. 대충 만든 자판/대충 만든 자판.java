import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
         int[] answer = new int[targets.length];
        Map<Character, Integer> keymapMap = new HashMap<>();

        for (String row : keymap) {
            for (int j = 0; j < row.length(); j++) {
                char key = row.charAt(j);
                keymapMap.put(key, Math.min(keymapMap.getOrDefault(key, j), j));
            }
        }

        for (Map.Entry<Character, Integer> entry : keymapMap.entrySet()) {
            keymapMap.put(entry.getKey(), entry.getValue() + 1);
        }

        for (int i = 0; i < targets.length; i++) {
            int num = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char targetChar = targets[i].charAt(j);
                if (keymapMap.containsKey(targetChar)) {
                    num += keymapMap.get(targetChar);
                } else {
                    num = -1;
                    break;
                }
            }
            answer[i] = num;
        }

        return answer;
    }
}