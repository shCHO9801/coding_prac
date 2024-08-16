import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        for(int i : score){
            list.add(i);
            Collections.sort(list, (x,y) -> {
               return y-x; 
            });
            if(list.size() < k){
                answer[idx++] = (int)list.get(list.size() - 1);
            }
            else{
                answer[idx++] = (int)list.get(k - 1);
            }
        }
        
        return answer;
    }
}