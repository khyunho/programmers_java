class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int j = 1;
        int k = 0;
        
        String[] str = my_string.split(" ");

        answer = Integer.parseInt(str[0]);
       
        for (int i = 0; i < str.length / 2; i++) {
            if (str[j].equals("+")) {
                answer = answer + Integer.parseInt(str[k + 2]);
                j += 2;
                k += 2;
            } else {
                answer = answer - Integer.parseInt(str[k + 2]);
                j += 2;
                k += 2;
            }
        }
        return answer;
    }
}
