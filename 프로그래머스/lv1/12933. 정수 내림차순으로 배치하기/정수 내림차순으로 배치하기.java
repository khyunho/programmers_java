import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = Long.toString(n).split("");
        String str = "";
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int i=0; i<arr.length; i++) {
            str += arr[i];
        }
        
        return answer = Long.parseLong(str);
    }
}