import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int x = wallpaper[0].length();
        int y = wallpaper.length;
        ArrayList<Integer> xArr = new ArrayList<>();
        ArrayList<Integer> yArr = new ArrayList<>();
        
        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    xArr.add(j);
                    yArr.add(i);
                }
            }
        }

        Collections.sort(xArr);
        
        int[] answer = {yArr.get(0), xArr.get(0), yArr.get(yArr.size()-1)+1, xArr.get(xArr.size()-1)+1};
            
        return answer;
    }
}

// [y최초 발견, x최초 발견, y마지막 발견+1, x마지막 발견+1]

// 01000
// 00100
// 00010

// 0000000000
// 0000010000
// 0000001100
// 0001100000
// 0000100000