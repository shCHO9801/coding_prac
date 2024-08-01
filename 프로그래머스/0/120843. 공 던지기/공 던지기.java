class Solution {
    public int solution(int[] numbers, int k) {
        k--;
        k*=2;
        return numbers[k%numbers.length];
    }
}