import java.util.*;

class Solution {
    public static int[] setStudents(int n, int[] lost, int[] reserve){
        int[] arr = new int[n + 2];
        Arrays.fill(arr, 1);
        arr[0] = 0;
        arr[n + 1] = 0;
        
        for(int l : lost){
            arr[l]--;
        }
        
        for(int r : reserve){
            arr[r]++;
        }
        
        return arr;
    }
    
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] students = setStudents(n, lost, reserve);
        
        for(int i = 1; i <= n; i++){
            if(students[i] == 0){
                if(students[i - 1] >= 2){
                    students[i - 1]--;
                    students[i]++;
                } else if(students[i + 1] >= 2){
                    students[i + 1]--;
                    students[i]++;
                }
            }
        }
        
        for(int i = 1; i <= n; i++){
            if(students[i] >= 1){
                answer++;
            }
        }
        
        return answer;
    }
}