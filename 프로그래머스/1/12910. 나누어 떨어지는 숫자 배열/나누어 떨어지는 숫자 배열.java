import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i : arr){
            if(i % divisor == 0){
                answer.add(i);
            }
        }
        Collections.sort(answer);
        
        return answer.size() == 0 ? new int[]{-1} : answer.stream().mapToInt(i -> i).toArray();
    }
}