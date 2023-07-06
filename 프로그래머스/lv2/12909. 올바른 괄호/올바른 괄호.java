class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int bs = 0;

        for (int i=0; i<s.length(); i++) {
            if (bs<0) {
                return !answer;
            } else if (s.charAt(i)=='(') {
                bs++;
            } else if (s.charAt(i)==')') {
                bs--;
            }
        }
        
        return answer = bs==0 ? true : false;
    }
}