import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];
        
        for (int i=0; i<arr1.length; i++) {
            strArr1[i] = Integer.toBinaryString(arr1[i]);
            arr1[i] = n-strArr1[i].length();
            strArr2[i] = Integer.toBinaryString(arr2[i]);
            arr2[i] = n-strArr2[i].length();
        }
        
        for (int i=0; i<strArr1.length; i++) {
            String insZero = "";
            for (int j=0; j<arr1[i]; j++) {
                insZero += "0";
            }
            strArr1[i] = insZero + strArr1[i];
        }
        
        for (int i=0; i<strArr2.length; i++) {
            String insZero = "";
            for (int j=0; j<arr2[i]; j++) {
                insZero += "0";
            }
            strArr2[i] = insZero + strArr2[i];
        }
        
        for (int i=0; i<strArr1.length; i++) {
            answer[i] = "";
            for (int j=0; j<strArr1.length; j++) {
                if (strArr1[i].charAt(j)=='0' && strArr2[i].charAt(j)=='0') {
                    answer[i] += " ";
                } else {
                    answer[i] += "#";
                }
            }
        }

        return answer;
    }
}