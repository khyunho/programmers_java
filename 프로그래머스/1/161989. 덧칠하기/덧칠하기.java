import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        if (m==1) {
            return section.length;
        }

        int answer = 1;
        int length = section[0]+m;
        List<Integer> list = new ArrayList<Integer>();

        for (int value : section) {
            list.add(value);
        }

        while (n >= length) {
            if (list.contains(length)) {
                answer++;
                length += m;
            } else {
                length++;
            }
        }
        
        // 속도 차이 심함
        // int roller = section[0];
        // int cnt = 1;
        // for(int i = 1; i < section.length; i++) {
        //     if(roller + m - 1 < section[i]) {
        //         cnt++;
        //         roller = section[i];
        //     }
        // }
        // return cnt;

        return answer;
    }
}