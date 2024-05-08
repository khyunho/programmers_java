import java.util.*;

class Solution {
    public StringBuilder solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        
        for (int i=0; i<my_string.length(); i++) {
            if ((int)my_string.charAt(i)>90) {
                answer.append((char)(my_string.charAt(i)-32));
            } else {
                answer.append((char)(my_string.charAt(i)+32));
            }
        }
        
        return answer;
    }
}