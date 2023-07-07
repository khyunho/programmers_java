import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        ArrayList <Integer> xList = new ArrayList<>();
        ArrayList <Integer> yList = new ArrayList<>();
        
        for (int i=0; i<sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]){
                xList.add(sizes[i][0]);
                yList.add(sizes[i][1]);
            } else {
                xList.add(sizes[i][1]);
                yList.add(sizes[i][0]);
            }
        }
        
        Collections.sort(xList);
        Collections.sort(yList);
        
        answer = xList.get(xList.size()-1) * yList.get(yList.size()-1);
        
        return answer;
    }
}





// int area = 0;
//         ArrayList <Integer> numList = new ArrayList<>();
//         ArrayList <Integer> areaList = new ArrayList<>();
        
//         for (int i=0; i<sizes.length; i++) {
//             numList.add(sizes[i][0]);
//             numList.add(sizes[i][1]);
//             if (area < (sizes[i][0] * sizes[i][1])) {
//                 area = sizes[i][0] * sizes[i][1];
//             }
//         }
        
//         System.out.println(numList);
        
//         for (int i=0; i<numList.size(); i+=2) {
//             for (int j=1; j<numList.size(); j+=2) {
//                 areaList.add(numList.get(i) * numList.get(j));
//             }
//         }
        
//         HashSet<Integer> set = new HashSet<>(areaList);
//         areaList.clear();
//         areaList.addAll(set);
        
//         Collections.sort(areaList);
        
//         System.out.println(areaList);
        
//         for (Integer num : areaList) {
//             if (num == area) {
//                 answer = num;
//                 break;
//             } else if (num > area){
//                 answer = num;
//                 break;
//             }
//         }