class Solution {
    public int[][] solution(int number) {
        int[][] answer = new int[number][number];
        int arrNum = 1;
        int postionX = 0;
        int postionY = number-1;
        int num = 0;
        
        while (number*number > arrNum-1) {
            switch (num) {
                case 0:
                    for (int i = postionX; i <= postionY; i++) {
                        answer[postionX][i] = arrNum++;
                    }
                    num++;
                    break;
                case 1:
                    for (int i = postionX + 1; i <= postionY; i++) {
                        answer[i][postionY] = arrNum++;
                    }
                    num++;
                    break;
                case 2:
                    for (int i = postionY-1; i >= postionX; i--) {
                        answer[postionY][i] = arrNum++;
                    }
                    postionY--;
                    num++;
                    break;
                case 3:
                    for (int i = postionY; i > postionX; i--) {
                        answer[i][postionX] = arrNum++;
                    }
                    postionX++;
                    num = 0;
                    break;
            }
            
        }
        
        return answer;
    }
}