class Solution {
    static boolean[] memo;
    public static boolean isPrime(int n){
        if (memo[n]){
            return memo[n];
        }
        if(n == 2){
            return memo[n] = true;
        }
        if(n % 2 == 0){
            return false;
        }
        
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return memo[n] = true;
        
    }
    public int solution(int[] nums) {
        int answer = 0;
        memo = new boolean[3001];
        
        for(int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if(isPrime(nums[i] + nums[j] + nums[k])){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}