import java.util.*;

class Solution {
    public int solution(int[] array) {
        List<Integer> maxValueList = new ArrayList<Integer>();
        int[] noDuplicatesArray = Arrays.stream(array).distinct().toArray();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i=0; i<noDuplicatesArray.length; i++) {
            countMap.put(noDuplicatesArray[i], 0);
        }

        for(int value : array) {
            countMap.put(value, countMap.get(value)+1);
        }
        
        for(int value : countMap.keySet()) {
            if(countMap.get(value) == Collections.max(countMap.values())) {
                maxValueList.add(value);
            }
        }

        if (maxValueList.size()>1) {
            return -1;
        } else {
            return maxValueList.get(0);
        }
    }
}