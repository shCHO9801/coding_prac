class Solution {
    public int[] solution(int n, int m) {
        int gcd  = 1;
        int idx = 2;
        
        while(idx < Math.max(n, m)){
            while(n % idx == 0 && m % idx == 0){
                n /= idx;
                m /= idx;
                gcd *= idx;
            }
            idx++;
        }
        
        
        int[] answer = {gcd, gcd * n * m};
        return answer;
    }
}