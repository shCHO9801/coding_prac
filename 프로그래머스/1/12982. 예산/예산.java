import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            if(count + d[i] > budget){
                break;
            }
            count += d[i];
            answer++;
        }
        return answer;
    }
}