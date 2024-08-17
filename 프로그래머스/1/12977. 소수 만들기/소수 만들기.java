import java.util.*;
class Solution {
    static boolean[] memo = new boolean[4000];
    static boolean isPrime(int n){
        if(n == 1 || n == 2)
            return false;
        if(memo[n])
            return true;
        int i = 2;
        for(; i < n; i++){
            if(n % i == 0){
                break;
            }
        }
        
        if(i == n){
            return memo[n] = true;
        }
        return false;
    }
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.fill(memo, false);
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int num = nums[i] + nums[j] + nums[k];
                    if(isPrime(num)){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}