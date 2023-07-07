import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        StringBuffer sb = new StringBuffer();
        
        // step 1.
        answer = answer.toLowerCase();
        
        // step 2.
        answer = answer.replaceAll("[^a-z|0-9|\\.|_|-]","");
        
        // step 3.
        answer = answer.replaceAll("\\.+", ".");
        
        // step 4.
        sb.append(answer);
        if (answer.length() > 1){
            if (answer.startsWith(".")) {
                sb.deleteCharAt(0);
                answer = sb.toString();
                sb.setLength(0);
                sb.append(answer);
            } 
            if (answer.endsWith(".")) {
                sb.deleteCharAt(answer.length()-1);       
                answer = sb.toString();
            }
        } else if (answer.equals(".")) {
            answer = "";
        }
        sb.setLength(0);
        
        // step 5.
        if (answer.equals("")) {
            answer = "a";
        }
        
        // step 6.
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            if (answer.endsWith(".")) {
                sb.append(answer);
                sb.deleteCharAt(answer.length()-1);
                answer = sb.toString();
                sb.setLength(0);
            }
        }

        // step 7.
        if (answer.length() <= 2) {
            while (answer.length() < 3){
               answer += answer.charAt(answer.length()-1); 
            }
        }
        
        return answer;
    }
}