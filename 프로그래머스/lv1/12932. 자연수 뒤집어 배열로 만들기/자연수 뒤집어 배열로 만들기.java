import java.util.*;

class Solution {
    public int[] solution(long n) {
        // int[] answer = {};
        
        List<String> arr = Arrays.asList(Long.toString(n).split(""));
        Collections.reverse(arr);
        
        int[] answer = arr.stream().mapToInt(Integer::parseInt).toArray();
        
        return answer;
        
//         String[] arr = Long.toString(n).split("");
//         Collections.reverse(Arrays.asList(arr));
        
//         int[] answer = new int[arr.length];
        
//         for (int i=0; i<arr.length; i++) {
//             answer[i] = Integer.parseInt(arr[i]);
//         }
            
//         return answer;
    }
}