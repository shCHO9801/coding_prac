class Solution {
    boolean solution(String s) {
        long countP = s.chars()
            .filter(ch -> ch == 'p' || ch == 'P')
            .count();
        long countY = s.chars()
            .filter(ch -> ch == 'y' || ch == 'Y')
            .count();
        return countP == countY;
    }
}