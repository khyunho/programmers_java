import java.util.*;

class Solution {
    public int solution(int n) {
        int count = 0;
        
        for (int i=1; count<n; i++) {
            if (i%3!=0 && !Integer.toString(i).contains("3")) {
                count++;
                if (count==n) {
                    return i;
                }
            }
        }
        
        // System.out.println(arrList.get(n-1));
        
        
        return count;
    }
}