import java.util.*;

class Solution {
    static int[] rank = {6, 6, 5, 4, 3, 2, 1};
    
    public int[] solution(int[] lottos, int[] win_nums) {
        List<Integer> win = new ArrayList<>();
        int count = 0;
        int countZero = 0;
        
        for(int w : win_nums){
            win.add(w);
        }
        
        for(int i : lottos){
            if(i == 0){
                countZero++;
            } else if (win.contains(i)){
                count++;
            }
        }
        
        return new int[]{rank[count + countZero], rank[count]};
    }
}