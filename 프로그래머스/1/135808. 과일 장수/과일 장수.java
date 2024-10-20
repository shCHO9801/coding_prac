import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        if(score.length < m){
            return answer;
        }
        
        Arrays.sort(score);
        
        for(int i = score.length - m; i >= 0; i -= m){
            answer += score[i] * m;
        }
        
        return answer;
    }
}