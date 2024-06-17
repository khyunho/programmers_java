import java.util.*;

class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        int lostStudent = lost.length;

        Set<Integer> lostSet = new HashSet<Integer>();
        Set<Integer> reserveSet = new HashSet<Integer>();

        setDefaultValue(lost, reserve, lostSet, reserveSet);

        for (int num : lost) {
            if (reserveSet.contains(num)) {
                lostSet.remove(num);
                reserveSet.remove(num);
                lostStudent--;
            }
        }

        List<Integer> lostList = new ArrayList<>(lostSet);

        for (int i = 0; i < lostList.size(); i++) {
            if (reserveSet.contains(lostList.get(i)-1)) {
                reserveSet.remove(lostList.get(i)-1);
                lostStudent--;
            } else if (reserveSet.contains(lostList.get(i)+1)) {
                reserveSet.remove(lostList.get(i)+1);
                lostStudent--;
            } else if (reserveSet.size()==0) {
                break;
            }
        }
        
        return n-lostStudent;
    }

    public static void setDefaultValue(int[] lost, int[] reserve, Set<Integer> lostSet, Set<Integer> reserveSet) {
        for (int num : lost) {
            lostSet.add(num);
        }
        for (int num : reserve) {
            reserveSet.add(num);
        }
    }
}