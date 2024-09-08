class Solution {
    
    public static int f(long n){
        if(n == 1){
            return 0;
        }
        return 1 + f(n % 2 == 0 ? n / 2 : (3 * n + 1));
    }
    public int solution(int num) {
        int answer = f(num);
        return answer >= 500 ? -1 : answer;
    }
}