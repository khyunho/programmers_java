import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] stack = new int[ingredient.length];
        int num = 0;

        for (int value : ingredient) {
            stack[num++] = value;

            if (num >= 4) {
                if (stack[num-1] == 1 &&
                        stack[num-2] == 3 &&
                        stack[num-3] == 2 &&
                        stack[num-4] == 1) {
                    answer++;
                    num -= 4;
                }
            }
        }

        return answer;
    }
}