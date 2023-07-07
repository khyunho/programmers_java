class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                answer += i;
            }
        }
        
        // int i = 2;
        // if(n>2){
        //     while (i<n) {
        //         if(n%i==0){
        //             answer += i;
        //         }
        //         i++;
        //     }
        //     answer += n;
        // } else if (n==2) {
        //     answer += 2;
        // } else if (n==0) {
        //     answer = 0;
        // }
        
        
        return answer;
    }
}