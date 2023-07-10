import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        
        int answer = 45 - sum;
        
        return answer;
    }
}