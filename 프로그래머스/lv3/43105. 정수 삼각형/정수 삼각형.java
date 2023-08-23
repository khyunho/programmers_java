import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        
        for (int i=triangle.length-1; i>0; i--) {
            for (int j=0; j<triangle[i].length-1; j++) {
                int value1 = triangle[i][j] + triangle[i-1][j];
                int value2 = triangle[i][j+1] + triangle[i-1][j];
                
                triangle[i-1][j] = value1 > value2 ? value1 : value2;
                
            }
        }

        return answer = triangle[0][0];
    }
}


// (0,0)
// (1,0), (1,1)
// (2,0), (2,1), (2,2)
// (3,0), (3,1), (3,2), (3,3)
// (4,0), (4,1), (4,2), (4,3), (4,4)



// ---------------------------

// maxArrKeep.get(maxArr.get(0));
            
//             for (int j=1; j<=i; j++) {
//                 if (maxArr.get(j) > maxArr.get(j+1)) {
//                     maxArrKeep.get(maxArr.get(j));
//                 } else {
//                     maxArrKeep.get(maxArr.get(j+1));
//                 }
//             }
            
//             maxArrKeep.get(maxArr.get(maxArr.size()-1));

//             for (int j=0; j<maxArrKeep.size(); j++) {
//                 triangle[i + 1][j] = maxArrKeep.get(j);
//             }
            
//             maxArrKeep.clear();
//             maxArr.clear();



