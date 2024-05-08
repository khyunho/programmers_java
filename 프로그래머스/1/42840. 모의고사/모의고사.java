import java.util.*;

class Solution {
    int[] one = {1, 2, 3, 4, 5};
    int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] num = new int[3];

        for (int i=0; i<answers.length; i++) {
            if (one[i%one.length] == answers[i]) {
                num[0]++;
            }
            if (two[i%two.length] == answers[i]) {
                num[1]++;
            }
            if (three[i%three.length] == answers[i]) {
                num[2]++;
            }
        }

        setAnswer(answer, num);

        return answer;
    }

    public List<Integer> setAnswer(List<Integer> answer, int[] num) {
        int max = Arrays.stream(num).max().getAsInt();

        for (int i=0; i<num.length; i++) {
            if (max == num[i]) {
                answer.add(i+1);
            }
        }

        return answer;
    }
    
}