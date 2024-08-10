class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {1,1};
        int idx = 2;
        while(Math.max(n,m) >= idx){
            while(m % idx == 0 && n % idx == 0){
                n/=idx;
                m/=idx;
                answer[0] *= idx;
            }
            idx++;
        }
        answer[1] = m * n * answer[0];
        return answer;
    }
}