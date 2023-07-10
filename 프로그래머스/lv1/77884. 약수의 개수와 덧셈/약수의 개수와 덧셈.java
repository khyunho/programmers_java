import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int num = right - left;
        ArrayList<Integer> numArr = new ArrayList<>();
        
        for (; num>=0; num--) {
            for (int i=1; i<=(left+num); i++){
                if ((left+num)%i==0) {
                    numArr.add(i);    
                }
            }
            answer = numArr.size()%2==0 ? answer + (left+num) : answer - (left+num);
            numArr.clear();
        }
        
        return answer;
    }
}