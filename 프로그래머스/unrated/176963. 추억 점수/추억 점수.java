import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i=0; i<photo.length; i++) {
            Set<String> uniqueNames = new HashSet<>(Arrays.asList(photo[i]));
            for (String uniqueName : uniqueNames) {
                int num = Arrays.asList(name).indexOf(uniqueName);
                if (num >= 0) {
                    answer[i] += yearning[num];
                }
            }
        }
        
        
        // for (int i=0; i<photo.length; i++) {
        //     for (int j=0; j<photo[i].length; j++) {
        //         for (int k=0; k<yearning.length; k++) {
        //             photo[i][j] = photo[i][j].replaceAll(name[k], Integer.toString(yearning[k]));
        //         }
        //         photo[i][j] = photo[i][j].replaceAll("[a-z]", "");
        //         if(!photo[i][j].equals("")){
        //             answer[i] += Integer.parseInt(photo[i][j]);
        //         }
        //     }
        // }
        
        return answer;
    }
}