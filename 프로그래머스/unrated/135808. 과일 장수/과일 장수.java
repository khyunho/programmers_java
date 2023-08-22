import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int num = score.length/m;
        int scoreNum = score.length-m;
        int ansNum = 1;
        Arrays.sort(score);

        for (int i=num; i>0; i--) {
            ansNum = score[scoreNum]*m;
            scoreNum -= m;
            answer += ansNum;
            ansNum = 1;
        } 

        return answer;
    }
}