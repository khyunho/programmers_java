import java.util.*;

class Solution {
    public int solution(String t, String p) {
        String str = "";
        String[] tArr = t.split("");
        ArrayList<String> tArrList = new ArrayList<>();
        
        for (int i=0; i<=tArr.length-p.length(); i++) {
            for (int j=0; j<p.length(); j++) {
                str += tArr[i+j];
            }
            tArrList.add(str);
            str = "";
        }
        tArrList.add(p);
        tArrList.sort(null);
        
        int answer = tArrList.lastIndexOf(p);
        
        return answer;
    }
}