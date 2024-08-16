import java.util.*;

class Solution
{
    static int answer;
    static Stack<Character> charStack = new Stack<Character>();

    public int solution(String s) {
        
        for (char value : s.toCharArray()) {
            if (!charStack.isEmpty() && charStack.peek() == value) {
                charStack.pop();
            } else {
                charStack.push(value);
            }
        }

        return charStack.isEmpty() ? 1 : 0;
    }
}