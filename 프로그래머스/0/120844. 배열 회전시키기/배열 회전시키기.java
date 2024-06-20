import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers, String direction) {
        List<Integer> answer = new ArrayList<>();
        
        for (int value : numbers) {
            answer.add(value);
        }
        
        if (direction.equals("right")) {
            int num = answer.get(answer.size()-1);
            answer.remove(answer.size()-1);
            answer.add(0, num);
        } else {
            int num = answer.get(0);
            answer.remove(0);
            answer.add(num);
        }
        
        // if (direction.equals("right")) {
        //     for (int i=0; i<numbers.length; i++) {
        //         if (i==0) {
        //             answer.add(numbers[numbers.length-1]);
        //         } else {
        //             answer.add(numbers[i-1]);
        //         }
        //     }
        // } else {
        //     for (int i=0; i<numbers.length; i++) {
        //         if (i==numbers.length-1) {
        //             answer.add(numbers[0]);
        //         } else {
        //             answer.add(numbers[i+1]);
        //         }
        //     }
        // }
        
        return answer;
    }
}