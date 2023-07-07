class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String str = "";
        
        for (char c=97; c<123; c++) {
            str += c;
        }
        
        for (int i=0; i<skip.length(); i++) {
            str = str.replace(Character.toString(skip.charAt(i)), "");    
        }
        
        for (int i=0; i<s.length(); i++) {
            int j = str.indexOf(Character.toString(s.charAt(i))) + index;
            // if (j>=str.length()) {
            //     j %= str.length();
            // }
            answer += str.charAt(j%str.length());
        }
       
        return answer;
    }
}