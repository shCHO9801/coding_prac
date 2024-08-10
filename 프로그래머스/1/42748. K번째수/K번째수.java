import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List <Integer> list;
        int idx = 0;
        for(int[] q : commands){
            int i = q[0]-1;
            int j = q[1]-1;
            int k = q[2]-1;
            list = new ArrayList<>();
            for(;i<=j;i++)
                list.add(array[i]);
            Collections.sort(list);
            answer[idx++] = list.get(k);
        }
        return answer;
    }
}