import java.util.*;

class Solution {
    public String solution(String s, int n) {
        // 65~90 -> A-Z
        // 97~122 -> a-z
        String answer = "";
        
        for (int i=0; i<s.length(); i++) {
            
            char b = ' ';
            
            if (s.charAt(i) == ' '){
                b = ' ';  
            } else if (s.charAt(i)+n > 90 && s.charAt(i)<91) {
                b = (char)((s.charAt(i)+n) - 26);
            } else if (s.charAt(i)+n > 122 && s.charAt(i) < 123){
                b = (char)((s.charAt(i)+n) - 26);
            } else {
                b = (char)(s.charAt(i)+n);
            }
            
            answer += Character.toString(b);
        }
        
        
        // System.out.println(map);
        
        
        return answer;
    }
}