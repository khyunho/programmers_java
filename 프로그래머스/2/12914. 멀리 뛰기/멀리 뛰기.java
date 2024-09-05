import java.util.*;

class Solution {
    public long solution(int n) {
        List<Long> answer = new ArrayList<>();
        answer.add(1L);
        answer.add(1L);
        answer.add(2L);

        for (int i=2; i<n; i++) {
            answer.add((answer.get(i) + answer.get(i-1))%1234567);
        }
        
        System.out.println(answer);
        
        return answer.get(n);
    }
}