import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for (int i=0; i<operations.length; i++) {
            if (operations[i].charAt(0) == 'I') {
                heap.offer(Integer.parseInt(operations[i].substring(2)));
            } else if (operations[i].charAt(0) == 'D' && operations[i].charAt(2) == '-') {
                heap.poll();
            } else {
                maxHeap.addAll(heap);
                maxHeap.poll();
                heap.clear();
                heap.addAll(maxHeap);
                maxHeap.clear();
            }
        }
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int value : heap) {
            arrList.add(value);
        }
        
        Collections.sort(arrList);
        
        if (arrList.size() == 0) {
            return answer;
        } else if (arrList.size() == 1) {
            answer[0] = arrList.get(0);
            answer[1] = arrList.get(0);
        } else {
            answer[0] = arrList.get(arrList.size()-1);
            answer[1] = arrList.get(0);
        }
        
        return answer;
    }
}