import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> numList = new ArrayList<>();
        
        for (int i=0; i<commands.length; i++) {
            for (int j=commands[i][0]-1; j<commands[i][1]; j++) {
                numList.add(array[j]);
            }
            Collections.sort(numList);
            answer[i] = numList.get(commands[i][2]-1);
            numList.clear();
        }
        
        return answer;
    }
}