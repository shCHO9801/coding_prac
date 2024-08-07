import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for(int i : numbers) count[i]++;
        for(int i = 1;i<count.length;i++){
            if(count[i]==0) answer+=i;
        }
        return answer;
    }
}