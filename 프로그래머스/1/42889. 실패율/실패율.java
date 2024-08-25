import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N + 2];
        int player = stages.length;
        
        for(int s : stages){
            count[s]++;
        }
        
        double[][] fail = new double[N][2];
        
        for(int i = 1; i <= N; i++){
            if(player == 0){
                fail[i - 1][0] = i;
                fail[i - 1][1] = 0.0;
            }
            else{
                double tmp = (double) count[i] / player;
                fail[i - 1][0] = i;
                fail[i - 1][1] = tmp;
                player -= count[i];
            }
        }
        
        Arrays.sort(fail, (a, b) -> {
            if(a[1] == b[1]){
                return Double.compare(a[0], b[0]);
            }
            else{
                return Double.compare(b[1], a[1]);
            }
        });
        
        for(int i = 0; i < N; i++){
            answer[i] = (int)fail[i][0];
        }
        return answer;
    }
}