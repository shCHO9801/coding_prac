import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n + 1];
        ArrayList <Integer> tmp = new ArrayList<>();
        
        Arrays.fill(arr, 1);
        
        for(int l : lost){
            arr[l]--;
        }
        
        for(int r : reserve){
            arr[r]++;
        }
        
        for(int i = 1; i <= n; i++){
            if(arr[i] == 0){
                if(i > 1 && arr[i - 1] > 1){
                    arr[i]++;
                    arr[i - 1]--;
                }
                else if(i < n && arr[i + 1] > 1){
                    arr[i]++;
                    arr[i + 1]--;
                }
            }
        }
        
        for(int i = 1; i <= n; i++){
            if(arr[i] > 0){
                answer++;
            }
        }
        return answer;
    }
}