class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = brown/2 - 1;
        int extent = brown + yellow;
        int length = 3;
        
        while (width*length < extent) {
            width--;
            length++;
        }
        
        answer[0] = width;
        answer[1] = length;
        
        return answer;
    }
}