class Solution {
    public String solution(String s) {
        int right = s.length() / 2;
        int left = s.length() % 2 == 0 ? right - 1 : right;
        
        return s.substring(left, right + 1);
    }
}