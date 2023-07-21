import java.util.*;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i=2; i<=n; i++) {
            boolean flag = true;
            for (int num : arrList) {
                if (i%num == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arrList.add(i);
            }
        }
        
        System.out.println(arrList);
        
        return n-(arrList.size()+1);
    }
}