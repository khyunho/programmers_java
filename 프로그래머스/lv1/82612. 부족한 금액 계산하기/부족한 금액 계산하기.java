class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;
        
        for (long i=1; i<=count; i++) {
            money -= price*i;
        }

        return answer = money < 0 ? money * -1 : 0;
    }
}