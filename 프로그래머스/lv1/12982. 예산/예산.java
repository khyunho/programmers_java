import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int num = 0;
        Arrays.sort(d);
        
        for (int i=0; i<d.length; i++) {
            num += d[i];
            if (num > budget) {
                return answer = i;
            }
            // else if (num == budget) {
            //     return answer = i+1;
            // }
        }
        
        if (num <= budget) {
            return answer = d.length;
        }

        
        return answer;
    }
}