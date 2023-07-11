class Solution {
    boolean solution(String str) {
        boolean answer = true;
        
        str = str.replaceAll("p|P", "1")
                 .replaceAll("y|Y", "2")
                 .replaceAll("[a-z|A-Z]", "");
        
        String[] strArr = str.split("");
        // int pNum = 0;
        // int yNum = 0;
        int num = 0;
        
        for (int i = 0; i < strArr.length; i++){
            if (strArr[i].equals("1")) {
                num += 1;
            } 
            if (strArr[i].equals("2")){
                num -= 1;
            }
        } 
        
        return answer = num == 0 ? true : false;
    }
}