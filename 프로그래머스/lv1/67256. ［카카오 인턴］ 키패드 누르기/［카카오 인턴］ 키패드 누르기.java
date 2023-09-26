class Solution {
    public String answer = "";
    public int[] numL = {3, 0};
    public int[] numR = {3, 2};
    
    public String solution(int[] numbers, String hand) {
        numSwitch(numbers, hand);
        return answer;
    }
  
    public void numSwitch(int[] numbers, String hand) {
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                numL[0] = num/3;
                numL[1] = 0;
                answer += "L";
            } else if (num == 3 || num == 6 || num == 9) {
                numR[0] = num/3 - 1;
                numR[1] = 2;
                answer += "R";
            } else {
                middleNum(num, hand);
            }
        }
    }
    
    public void middleNum(int num, String hand) {
        int compL = 0;
        int compR = 0;
        if (num == 0) {
            num = 11;
        } 
        compL = Math.abs(numL[0] - num/3) + Math.abs(numL[1] - 1);
        compR = Math.abs(numR[0] - num/3) + Math.abs(numR[1] - 1);
        middleSwitch(compL, compR, num, hand);
    }
    
    public void middleSwitch(int compL, int compR, int num, String hand) {
        if (compL < compR || (compL == compR && hand.equals("left"))) {
            numL[0] = num/3;
            numL[1] = 1;
            answer += "L";
        } else if (compL > compR || (compL == compR && hand.equals("right"))) {
            numR[0] = num/3;
            numR[1] = 1;
            answer += "R";
        } 
    } 
}