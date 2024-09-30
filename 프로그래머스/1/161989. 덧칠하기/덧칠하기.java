import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int cur = 0;
        
        for(int i : section){
            if(cur < i){
                answer++;
                cur = i + m - 1;    
            }
        }
        
        return answer;
    }
}