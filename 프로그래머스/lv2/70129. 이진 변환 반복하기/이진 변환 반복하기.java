class Solution {
    public int[] solution(String str) {
        int[] answer = new int[2];
        
        while (str.length()>1) {
            answer[0] += 1;
            answer[1] += (str.length()-str.replaceAll("0","").length());
            if (str.length()==1) {
                break;
            }
            str = str.replaceAll("0", "");
            str = Integer.toBinaryString(str.length());
        }
        
        return answer;
    }
}