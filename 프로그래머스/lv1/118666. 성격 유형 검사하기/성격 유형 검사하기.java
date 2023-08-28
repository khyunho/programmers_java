class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] TFMN = new int[4];
        int[] RCJA = new int[4];
        int[] compNum = new int[4];
        String[] ans = {"R", "C", "J", "A"};
        
        for (int i=0; i<survey.length; i++) {
            int num = choices[i];
            int score = Math.abs(choices[i]-4);
            
            if (num > 4) {
                switch (survey[i].charAt(0)) {
                    case 'T': RCJA[0] += score; break;
                    case 'R': TFMN[0] += score; break;
                    case 'F': RCJA[1] += score; break;
                    case 'C': TFMN[1] += score; break;
                    case 'M': RCJA[2] += score; break;
                    case 'J': TFMN[2] += score; break;
                    case 'N': RCJA[3] += score; break;
                    case 'A': TFMN[3] += score; break;
                }
            } 
            
            if (num < 4) {
                switch (survey[i].charAt(0)) {
                    case 'T': TFMN[0] += score; break;
                    case 'R': RCJA[0] += score; break;
                    case 'F': TFMN[1] += score; break;
                    case 'C': RCJA[1] += score; break;
                    case 'M': TFMN[2] += score; break;
                    case 'J': RCJA[2] += score; break;
                    case 'N': TFMN[3] += score; break;
                    case 'A': RCJA[3] += score; break;
                }
            }
        }

        for (int i=0; i<4; i++) {
            if (TFMN[i] > RCJA[i]) {
                compNum[i] = 1;
            } else if (TFMN[i] < RCJA[i]) {
                compNum[i] = 0;
            } else {
                compNum[i] = 2;
            }
        }

        for (int i=0; i<4; i++) {
            if (compNum[i] == 1) {
                switch (i) {
                    case 0: ans[0] = "T"; break;
                    case 1: ans[1] = "F"; break;
                    case 2: ans[2] = "M"; break;
                    case 3: ans[3] = "N"; break;
                }
            }
        }
        
        for (String value : ans) {
            answer += value;
        }
        
        return answer;
    }
}
