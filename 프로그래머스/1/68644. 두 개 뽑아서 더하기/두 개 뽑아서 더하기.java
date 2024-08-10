import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> tmp = new HashSet<>();
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                tmp.add(numbers[i] + numbers[j]);
            }
        }
        answer = new int[tmp.size()];
        int idx = 0;
        for(int i : tmp){
            answer[idx++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }
}