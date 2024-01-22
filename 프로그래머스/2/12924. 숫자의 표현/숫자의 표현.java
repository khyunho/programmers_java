class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n==1) {
            answer = 1;
        } else if (n%2==0) {
            answer = even(n, answer);
        } else {
            answer = odd(n, answer);
        }
        
        return answer;
    }
    
    public int even (int n, int answer) {
        int num = n/2;
        for (int i=num; i>0; i--) {
            int ansNum = 0;
            for (int j=i; j>0; j--) {
                ansNum += j;
                if (ansNum == n) {
                    answer += 1;
                } else if (ansNum > n) {
                    break;
                }
            }
        }
        return answer+1;
    }
    
    public int odd (int n, int answer) {
        int num = n/2 + 1;
        for (int i=num; i>0; i--) {
            int ansNum = 0;
            for (int j=i; j>0; j--) {
                ansNum += j;
                if (ansNum == n) {
                    answer += 1;
                    break;
                } else if (ansNum > n) {
                    break;
                }
            }
        }
        return answer+1;
    }
}