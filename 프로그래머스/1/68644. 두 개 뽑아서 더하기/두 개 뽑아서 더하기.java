import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        Set <Integer> set = new TreeSet<>();
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = i + 1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        answer = new int[set.size()];
        int idx = 0;
        for(int i : set){
            answer[idx++] = i;
        }
        return answer;
    }
}