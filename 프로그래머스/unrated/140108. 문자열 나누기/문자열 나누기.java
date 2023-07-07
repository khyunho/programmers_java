class Solution {
    public int solution(String s) {
        int answer = 0;
        
        while (s.length() > 0) {
            answer++;
            
            int num1 = 1;
            int num2 = 0;  
            
            for (int i=0; i<s.length()-1; i++) {
                if (s.charAt(0) == (s.charAt(i+1))) {
                    num1++;
                } else {
                    num2++;
                }
                
                if (num1 == num2) {
                    break;
                }
            }
            s = s.substring(num1 + num2);
        }
        return answer;
    }
}