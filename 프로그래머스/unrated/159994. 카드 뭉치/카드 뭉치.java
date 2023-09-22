class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int num1 = 0;
        int num2 = 0;
        
        for (String goalStr : goal) {
            if (num1 < cards1.length && goalStr.equals(cards1[num1])) {
                num1++;
            } 
            if (num2 < cards2.length && goalStr.equals(cards2[num2])) {
                num2++;
            }
        }

        return answer = num1 + num2 == goal.length ? "Yes" : "No";
    }
}