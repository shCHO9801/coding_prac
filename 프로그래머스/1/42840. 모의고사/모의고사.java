import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int max = 0;
        
        int s[] = new int[4];
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == p1[i % p1.length]){
                s[1]++;
                max = Math.max(max, s[1]);
            }
            if(answers[i] == p2[i % p2.length]){
                s[2]++;
                max = Math.max(max, s[2]);
            }
            if(answers[i] == p3[i % p3.length]){
                s[3]++;
                max = Math.max(max, s[3]);
            }
        }
        
        for(int i = 1; i < s.length; i++){
            if(s[i] == max){
                answer.add(i);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}