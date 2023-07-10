import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        ArrayList<Integer> arrListNum = new ArrayList<>();
        
        while (n>=1) {
            arrListNum.add(n%3);
            n /= 3;
        }
        
        for (int i = arrListNum.size()-1; i>=0; i--) {
            answer += arrListNum.get(i) * num;
            num *= 3;
        }
        
        return answer;
    }
}