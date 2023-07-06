import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int boat = 0;
        
        Arrays.sort(people);
        
        ArrayDeque<Integer> deque = new ArrayDeque<>(50000);
        for (int value : people) {
            deque.addLast(value);
        }

        while (!deque.isEmpty()) {
            if (boat == 0) {
                boat = deque.pollFirst();
                answer++;
            } else if (!deque.isEmpty() && deque.peekLast() + boat > limit) {
                deque.pollLast();
                answer++;
            } else if (!deque.isEmpty() && deque.peekLast() + boat <= limit) {
                boat = 0;
                deque.pollLast();
            }
        }
        
        return answer;
    }
}