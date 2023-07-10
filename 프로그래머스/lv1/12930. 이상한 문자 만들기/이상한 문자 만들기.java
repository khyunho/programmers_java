import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] sArr = s.split(" ");
        
        
        for (int i=0; i<sArr.length; i++) {
            System.out.println(i + "번째 : " + sArr[i]);
            for (int j=0; j<sArr[i].length(); j++) {
                if (j%2==0) {
                    sb.append(Character.toUpperCase(sArr[i].charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(sArr[i].charAt(j)));
                }
            }
            if (!(i==sArr.length-1)){
                sb.append(" ");
            }
        }
        
        if (s.charAt(s.length() - 1) == ' ') {
            for (int i=s.length()-1; i>=0; i--) {
                if (s.charAt(i) != ' ') {
                    break;
                }
                sb.append(" ");
            }
        }
        
        return answer = sb.toString();
    }
}