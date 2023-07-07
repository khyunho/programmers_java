class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i < babbling.length; i++){
            babbling[i] = babbling[i].replaceAll("aya", "1");
            babbling[i] = babbling[i].replaceAll("ye", "1");
            babbling[i] = babbling[i].replaceAll("woo", "1");
            babbling[i] = babbling[i].replaceAll("ma", "1");
            babbling[i] = babbling[i].replaceAll("1", "");
            if(babbling[i].equals("")){
                answer += 1;
            }
        }
        
        // for (int i = 0; i < babbling.length; i++) {
        //     babbling[i] = babbling[i].replaceAll("1", "");
        //     if(babbling[i].equals("")){
        //         answer += 1;
        //     }
        // }
        
        return answer;
    }
}