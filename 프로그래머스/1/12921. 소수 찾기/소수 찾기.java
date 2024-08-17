class Solution {
    static boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        
        for(int i = 3; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(isPrime(i)){
                answer++;
            }
        }
        return answer;
    }
}