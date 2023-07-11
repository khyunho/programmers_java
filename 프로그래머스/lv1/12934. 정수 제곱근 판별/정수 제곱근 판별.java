import java.lang.Math;

class Solution {
    public long solution(long n) {
        double answer = 0;
        double num = (double)n;
        
        answer = Math.sqrt(num) == (int)Math.sqrt(num) ? Math.pow((Math.sqrt(num))+1, 2) : -1;
        
        return (long)answer;
    }
}