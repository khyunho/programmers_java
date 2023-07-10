import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> numList = new ArrayList<>();      
        Arrays.sort(arr);
        
        for (int i = 0; i<arr.length; i++) {
            if (arr[i]%divisor==0) {
               numList.add(arr[i]);
            }
        }
        
        if(!(numList.size()>0)) {
            numList.add(-1);
        }
        
        int[] answer = numList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}