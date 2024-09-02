import java.util.*;
class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
    
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr.length - i + " " + arr[i]);
            if(arr.length - i <= arr[i]){
                return arr.length - i;
            }
        }
        
        
        // 0 1 3 5 6
        return 0;
    }
}

