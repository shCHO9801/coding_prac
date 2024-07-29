class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0, idx = 0;
        while(answer <= n){
            answer+=numbers[idx++];
        }
        return answer;
    }
}