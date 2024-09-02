import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = arr.length;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            if(answer <= arr[i]){
                break;
            }
            answer -= 1;
        }
        
        
        // 0 1 3 5 6
        return answer;
    }
}

