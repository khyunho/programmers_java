import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int num = 0;
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i=0; i<k; i++) {
            if (k > score.length && i > score.length-1) {
                return answer;
            }
            arrList.add(score[i]);
            Collections.sort(arrList);
            answer[i] = arrList.get(0);
            num++;
        }
        
        for (; num<score.length; num++) {
            arrList.add(score[num]);
            Collections.sort(arrList);
            answer[num] = arrList.get(num-(k-1));
        }

        return answer;
    }
}