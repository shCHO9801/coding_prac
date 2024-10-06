import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = new int[n + 2];
        
        Arrays.fill(students, 1);
        for(int i : lost) students[i]--;
        for(int i : reserve) students[i]++;
        
        for(int i = 1; i <= n; i++){
            if(students[i] == 0){
                if(students[i - 1] > 1){
                    students[i - 1]--;
                    answer++;
                } else if(students[i + 1] > 1){
                    students[i + 1]--;
                    answer++;
                }
            } else {
                answer++;
            }
        }
        return answer;
    }
}