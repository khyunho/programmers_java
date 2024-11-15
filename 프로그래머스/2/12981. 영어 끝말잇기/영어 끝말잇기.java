import java.util.*;

class Solution {
    static int count = 1;
    static int cycle = 1;
    static boolean check = true;
    
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        countSet(n, words, answer);
        return answer;
    }

    private static int[] countSet(int n, String[] words, int[] answer) {
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);

            if (i > 0) {
                ruleCheck(words, i);
            }

            if (set.size() != i+1 || !check) {
                answer[0] = count;
                answer[1] = cycle;
                return answer;
            }

            if (count >= n) {
                count = 1;
                cycle++;
            } else {
                count++;
            }
            
        }
        
        return answer;
    }

    public static void ruleCheck(String[] words, int i) {
        if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
            check = false;
        }
    }
    
}