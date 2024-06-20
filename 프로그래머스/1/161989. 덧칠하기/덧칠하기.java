import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        if (m==1) {
            return section.length;
        }

        int answer = 1;
        int length = section[0]+m;
        int distance = m-1;
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

        return answer;
    }
}