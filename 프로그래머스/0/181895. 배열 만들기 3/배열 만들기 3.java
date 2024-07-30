import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List <Integer> answer = new ArrayList<>();
        for(int[] i : intervals){
            for(int j = i[0];j<=i[1];j++){
                answer.add(arr[j]);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}