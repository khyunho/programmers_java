import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] ranking = {6, 6, 5, 4, 3, 2, 1};
        int max = 0;
        int min = 0;

        ArrayList<Integer> winNums = new ArrayList<>();
        
        for (int num: win_nums) {
            winNums.add(num);
        }
        
        for (int num: lottos) {
            if(winNums.contains(num)) {
                min++;
            }
            if(num==0){
                max++;
            }
        }
        
        answer[0] = ranking[max+min];
        answer[1] = ranking[min];
        
        return answer;
    }
}