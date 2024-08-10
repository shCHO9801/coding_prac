import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, idx = 0;
        Arrays.sort(d);
        while(idx < d.length && budget >= d[idx]){
            answer++;
            budget-=d[idx++];
        }
        return answer;
    }
}