import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        
        for(int[] c : commands){
            int i = c[0] - 1;
            int j = c[1] - 1;
            int k = c[2] - 1;
            
            ArrayList <Integer> list = new ArrayList<>();
            for(int l = i; l <= j; l++){
                list.add(array[l]);
            }
            Collections.sort(list);
            answer[idx++] = list.get(k);
        }
        
        return answer;
    }
}