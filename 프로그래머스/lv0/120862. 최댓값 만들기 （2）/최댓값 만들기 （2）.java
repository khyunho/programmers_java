class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        if (numbers.length == 2) {
            answer = numbers[0]*numbers[1];
        } else {
            for (int i=0; i<numbers.length; i++) {
                for (int j=i+1; j<numbers.length; j++) {
                    answer = numbers[i]*numbers[j] > answer ? numbers[i]*numbers[j] : answer;
                }
            }
        }
        
        return answer;
    }
}