class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya", "1");
            babbling[i] = babbling[i].replaceAll("ye", "2");
            babbling[i] = babbling[i].replaceAll("woo", "3");
            babbling[i] = babbling[i].replaceAll("ma", "4");
            if (babbling[i].matches(".*\\D.*")) {
                babbling[i] = "";
            }
            
            if (babbling[i].length() != babbling[i].replaceAll("(\\d)\\1+", "").length()) {
                babbling[i] = "";
            }
            
            // String[] arr = babbling[i].split("");
            // for (int j = 0; j < arr.length-1; j++) {
            //     if (arr[j].equals(arr[j + 1])) {
            //         babbling[i] = "";
            //     }
            // }
            if(!(babbling[i].equals(""))){
                answer += 1;
            }            
        }    
        
        return answer;
    }
}