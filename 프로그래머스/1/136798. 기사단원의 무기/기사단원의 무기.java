import java.util.*;
class Solution {
    static int findNum(int n){
        if(n == 1)
            return 1;
        
        int result = 0;
        
        for(int i = 1; i * i <= n; i++){
            if(i * i == n) result++;
            else if(n % i == 0){
                result+=2;
            }
        }
        return result;
    }
    public int solution(int number, int limit, int power) {
        ArrayList <Integer>weapon = new ArrayList<>();
        for(int i = 1; i <= number; i++){
            int count = findNum(i);
            if(count > limit){
                count = power;
            }
            weapon.add(count);
        }
        return weapon.stream().mapToInt(i -> i).sum();
    }
}