import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == -1){
                int val = 0;
                for(int j = i+1; j < answer.length; j++){
                    val++;
                    if(s.charAt(i) == s.charAt(j)){
                        answer[j] = val;
                        val = 0;
                    }
                }
            }
        }
        return answer;
    }
}