import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Integer[] tmp = new Integer[score.length];
        for(int i = 0; i < score.length; i++){
            tmp[i] = score[i][0] + score[i][1];
        }
        Arrays.sort(tmp, (x,y) -> {
            return y-x;
        });
        for(int i = 0; i < score.length; i++){
            int x = score[i][0] + score[i][1];
            for(int j = 0; j < tmp.length; j++){
                if(x == tmp[j]){
                    answer[i] = j+1;
                    break;
                }
            }
        }
        return answer;
    }
}