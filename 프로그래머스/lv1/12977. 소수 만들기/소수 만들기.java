import java.util.*;

class Solution {
    public int solution(int[] nums) {
        ArrayList<Integer> numList = new ArrayList<>();
        
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    numList.add((nums[i] + nums[j] + nums[k]));
                }
            }
        }
        
        int answer = numList.size();
        
        for (int i=0; i<numList.size(); i++) {
            for (int j=2; j<numList.get(i)-1; j++) {
                if (numList.get(i) % j == 0) {
                    answer--;
                    break;
                }
            }
        }

        return answer;
    }
}