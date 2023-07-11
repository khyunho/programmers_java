class Solution {
    public int solution(long num) {
        int answer = 0;
        int n = 0;
        
        if (num==1) {
            return answer;
        }
           
        while (num!=1) {
            n++;
            if(n==500) {
                return -1;
            } else if (num%2==0) {
                num /= 2;
            } else {
                num = (num*3) + 1;
            }
        }

        return n;
    }
}