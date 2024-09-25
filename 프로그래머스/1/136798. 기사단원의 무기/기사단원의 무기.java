import java.util.*;

class Solution {
    
    public static int getDivisorCount(int n){
        int result = 0;
        
        for(int i = 1; i * i <= n; i++){
            if(i * i == n) result++;
            else if (n % i == 0) result += 2;
        }
        
        return result;
    }
    
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int num = 1; num <= number; num++){
            int divisor = getDivisorCount(num);
            
            if(divisor > limit){
                divisor = power;
            }
            
            answer += divisor;
        }
        
        return answer;
    }
}