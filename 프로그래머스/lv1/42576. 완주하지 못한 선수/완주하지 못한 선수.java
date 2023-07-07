import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i=0; i<completion.length; i++) {
            if (!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }
        
        if (answer.equals("")) {
            answer = participant[participant.length-1];
        }
        
        return answer;
    }
}

//         Map<String, Integer> pMap = new HashMap<>();
//         Map<String, Integer> cMap = new HashMap<>();
        
//         for (int i=0; i<participant.length; i++) {
//             if (pMap.containsKey(participant[i])) {
//                 pMap.put(participant[i], pMap.get(participant[i])+1);
//             } else {
//                 pMap.put(participant[i], 1);
//             }
//         }
        
//         for (int i=0; i<completion.length; i++) {
//             if (cMap.containsKey(completion[i])) {
//                 cMap.put(completion[i], cMap.get(completion[i])+1);
//             } else {
//                 cMap.put(completion[i], 1);
//             }
//         }
            
//         Set<String> keys = pMap.keySet();
        
//         for(String key : keys) {
//             if (!cMap.containsKey(key) || pMap.get(key)!=cMap.get(key)) {
//                 answer = key;
//                 break;
//             }
//         }