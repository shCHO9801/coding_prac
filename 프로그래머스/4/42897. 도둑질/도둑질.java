import java.util.*;
class Solution {
    public int solution(int[] money) {
        int n = money.length;
        int answer = 0;
        
        int[] dp = new int[n];
        dp[0] = money[0];
        dp[1] = Math.max(money[0], money[1]);
        
        for(int i = 2; i < n - 1; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + money[i]);
        }
        
        answer = dp[n - 2];
        Arrays.fill(dp, 0);
        
        dp[1] = money[1];
        
        for(int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + money[i]);
        }
        return Math.max(answer, dp[n - 1]);
    }
}