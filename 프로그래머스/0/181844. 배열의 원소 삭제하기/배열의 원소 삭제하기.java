import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for(int i : arr){
            boolean del = false;
            for(int j : delete_list){
                if(i == j){
                    del = true;
                    break;
                }
            }
            if(!del) answer.add(i);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}