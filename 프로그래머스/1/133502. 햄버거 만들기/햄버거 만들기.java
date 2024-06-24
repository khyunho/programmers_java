import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        StringBuilder strIngre = new StringBuilder();
        StringBuilder ingreKeep = new StringBuilder();

        for (int value : ingredient) {
            strIngre.append(value);
        }

        while (strIngre.length() > 0) {
            ingreKeep.append(strIngre.toString().replace("1231", ""));
            if (strIngre.length()-ingreKeep.length() > 4) {
                answer = (strIngre.length()-ingreKeep.length())/4;
            } else if (strIngre.length() != ingreKeep.length()) {
                answer++;
                strIngre.setLength(0);
                strIngre.append(ingreKeep);
                ingreKeep.setLength(0);
            }  else if (strIngre.length() == ingreKeep.length()) {
                break;
            }
        }

        return answer;
    }
}