class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        if (!(s.charAt(0)>=48 && s.charAt(0)<=57)) {
            sb.append((char) (s.charAt(0) - 32));
        } else {
            sb.append(s.charAt(0));
        }
        
        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i)!=' ' && s.charAt(i-1)==' ' && !(s.charAt(i)>=48 && s.charAt(i)<=57)) {
                sb.append((char)(s.charAt(i) - 32));
            } else {
                sb.append(s.charAt(i));
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}