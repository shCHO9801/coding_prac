import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int x = 0, y = 0;
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
            x = Math.max(x, sizes[i][0]);
            y = Math.max(y, sizes[i][1]);
        }
        int answer = x * y;
        return answer;
    }
}