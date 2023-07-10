class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        
        if (strArr.length%2!=0) {
            answer = strArr[strArr.length/2];
        } else {
            answer = strArr[(strArr.length/2)-1] + strArr[strArr.length/2];
        }
        
        
        return answer;
    }
}