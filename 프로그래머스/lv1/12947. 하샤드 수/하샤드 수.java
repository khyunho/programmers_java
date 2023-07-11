class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] arr = Integer.toString(x).split("");
        int num = 0;
        
        for (int i=0; i<arr.length; i++) {
            num += Integer.parseInt(arr[i]);
        }
        
        return x%num == 0;
        // return answer = x%num == 0 ? true : false;
    }
}