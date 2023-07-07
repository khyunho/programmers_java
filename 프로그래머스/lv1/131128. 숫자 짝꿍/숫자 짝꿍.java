import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int num = 0;
        int[] numX = new int[10];
        int[] numY = new int[10];
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<X.length(); i++) {
            numX[X.charAt(i)-48] += 1;
        }
        
        for (int i=0; i<Y.length(); i++) {
            numY[Y.charAt(i)-48] += 1;
        }
        
        for (int i=0; i<numX.length; i++) {
            if (numX[i]-numY[i]>=0) {
                continue;
            } else {
                numY[i] = numX[i];
            }
        }
        
        for (int i=9; i>=0; i--) {
            if (numY[i]!=0){
                for(int j=0; j<numY[i]; j++) {
                    sb.append(i);
                    if (i!=0) {
                        num++;
                    }
                }
            }
        }
        
        answer = sb.toString();
        
        if (answer.equals("")) {
            answer = "-1";
        } else if(num==0) {
            answer = "0";
        }
        
        return answer;
    }
}