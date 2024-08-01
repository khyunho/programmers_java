import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> Heap = new PriorityQueue<>();
        for (int value : scoville) {
            Heap.offer(value);
        }
        
        while (!Heap.isEmpty()) {
            if (Heap.size() != 1 && Heap.peek() < K) {
                Heap.offer(Heap.poll() + (Heap.poll()*2));
                answer++;
            } else {
                break;
            }
        }
        
        if (Heap.peek() < K) {
            answer = -1;
        }
        
        return answer;
    }
}