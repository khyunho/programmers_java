import java.util.*;

class Solution {
    public StringBuilder solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.split(" ");
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for (int i=0; i<str.length; i++) {
            heap.offer(Integer.parseInt(str[i]));
        }
        
        maxHeap.addAll(heap);
        
        answer.append(heap.peek());
        answer.append(" ");
        answer.append(maxHeap.peek());
        
        return answer;
    }
}