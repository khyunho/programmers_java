import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int value : A) {
            heap.offer(value);
        }
        
        for (int value : B) {
            maxHeap.offer(value);
        }
        
        for (int i=0; i<A.length; i++) {
            answer += heap.poll() * maxHeap.poll();
        }

        return answer;
    }
}