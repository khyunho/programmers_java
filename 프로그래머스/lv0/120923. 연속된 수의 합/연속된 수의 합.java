class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int setNum = 0;
        
        while (true) {
            int j=setNum;
            int ansNum = 0;
            for (int i=0; i<num; i++) { 
                ansNum += j;
                j++;
            }
            if (ansNum < total) {
                setNum++;
            } else if (ansNum > total) {
                setNum--;
            } else {
                break;
            }
        }
        
        for (int i=0; i<num; i++) {
            answer[i] = setNum;
            setNum++;
        }
        
        return answer;
    }
}