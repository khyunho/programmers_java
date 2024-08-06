import java.util.*;

class Solution {
    static int extNum;
    static int sortNum;
    static int[][] answer;

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        setExtNum(ext);
        setSortNum(sort_by);
        sortAnswer(data, val_ext, sortNum);
        return answer;
    }

    public void setExtNum(String ext) {
        switch (ext) {
            case "date": extNum = 1; break;
            case "maximum": extNum = 2; break;
            case "remain": extNum = 3; break;
            default: extNum=0; break;
        }
    }

    public void setSortNum(String sort_by) {
        switch (sort_by) {
            case "date": sortNum = 1; break;
            case "maximum": sortNum = 2; break;
            case "remain": sortNum = 3; break;
            default: sortNum=0; break;
        }
    }

    public void sortAnswer(int[][] data, int val_ext, int sortNum) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            if (data[i][extNum] < val_ext) {
                map.put(data[i][sortNum], map.getOrDefault(data[i][sortNum], i));
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        answer = new int[map.size()][data[0].length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = data[map.get(keySet.get(i))];
        }
    }
}