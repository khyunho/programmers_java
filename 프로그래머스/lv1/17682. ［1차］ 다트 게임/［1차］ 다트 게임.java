import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] numArr = dartResult.split("\\D+");
        String[] strArr = dartResult.split("\\d+");
        int[] ansArr = new int[numArr.length];
        
        for (int i=0; i<numArr.length; i++) {
            ansArr[i] = Integer.parseInt(numArr[i]);
        }
        
        for (int i=0; i<numArr.length; i++) {
            strArr[i+1] = strArr[i+1].replaceAll("S", "1").replaceAll("D", "2").replaceAll("T", "3");
            ansArr[i] = (int) Math.pow(ansArr[i], strArr[i+1].charAt(0)-48);
            if (strArr[i+1].length()>1) {
                if (strArr[i+1].charAt(1)==35) {
                    ansArr[i] *= -1;
                } else if (i==0 && strArr[i+1].charAt(1)==42) {
                    ansArr[i] *= 2;
                } else {
                    ansArr[i-1] *= 2;
                    ansArr[i] *= 2;
                }
            }
        }
        
        for (int value : ansArr) {
            answer += value;
        }
        
        return answer;
    }
}

// 나누어야함
// 1S. 2D*. 3T
// * = 이전, 지금 점수 2배 -> 이 말은
// 2D*에선 처음 나왔으니 2D에 2를 곱한 것과 같고

// 1S*. 2T*. 3S
// 여기선
// 1S*은 처음 *이 나와서 본인만 2배를 곱하고
// 2T*은 두번 째 나온 *이라 본인과 전 숫자 1S과 2T에 각각 2를 곱해준다.
// 즉 1S는 4배 2T는 2배

// S = 1제곱
// D = 2제곱
// T = 3제곱
// * = 이전, 지금 점수 2배 -> *2*2
// # = 지금 점수를 뺌 *(-1)
// 첫 * = 지금 점수 2배 -> *2
// S,D,T는 반드시 하나 존재
// *,#은 없을 수도 있다