class Solution {
    public static int collatz(long n){
        if(n == 1){
            return 0;
        }
        
        if(n % 2 == 0){
            return 1 + collatz(n/2);
        } else{
            return 1 + collatz(3 * n + 1);
        }
    }
    public int solution(int num) {
        int answer = collatz(num);
        return answer >= 500 ? -1 : answer;
    }
}