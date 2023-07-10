import java.util.*;

class Solution {
    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int num : arr) {
            list.add(num);
        }
        
        int minValue = list.stream().min(Integer::compareTo).get();
        
        list.removeIf(value -> value==minValue);
        
        if (list.size()==0) {
            list.add(-1);
        }

        return list;
    }
}