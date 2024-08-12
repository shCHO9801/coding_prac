class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] fibo = new int[100001];
        if(n < 3) return 1;
        fibo[1] = fibo[2] = 1;
        for(int i = 3; i <= n ; i++){
            fibo[i] = (fibo[i-2] + fibo[i-1]) % 1234567;
        }
        return fibo[n];
    }
}