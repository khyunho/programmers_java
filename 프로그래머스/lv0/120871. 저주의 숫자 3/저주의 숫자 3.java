import java.util.*;

class Solution {
    public int solution(int n) {
        int i = 0;
        
        for (int j=0; j<n; j++) {
            i++;
            while (i%3==0 || Integer.toString(i).contains("3")) {
                i++;
            }
        }
        
        return i;
    }
}