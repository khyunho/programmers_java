import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String binary = Integer.toBinaryString(n);
        int count = binary.length() - binary.replace("1", "").length();

        while (answer == 0) {
            String newBinary = Integer.toBinaryString(n+1);
            if (count == newBinary.length() - newBinary.replace("1", "").length()) {
                answer = n+1;
                break;
            }
            n++;
        }

        return answer;
    }
}