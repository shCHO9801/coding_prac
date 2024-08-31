class Solution {
    public long solution(long n) {
        return Math.sqrt(n) == (int)Math.sqrt(n) ? 
            (long)Math.pow((long)Math.sqrt(n) + 1, 2) : -1;
    }
}