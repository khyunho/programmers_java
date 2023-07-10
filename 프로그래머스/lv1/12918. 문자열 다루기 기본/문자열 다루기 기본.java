class Solution {
    public boolean solution(String s) {
        if (s.replaceAll("[^0-9]", "").length() != s.length()) {
            return false;
        } else {
            return s.length() == 4 || s.length() == 6;    
        }
    }
}