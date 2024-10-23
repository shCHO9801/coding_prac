import java.util.*;

class Solution {
    public static Integer gcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        return gcd(b, a % b);
    }
    
    public int solution(int[] arr) {
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length - 1; i++){
            int num = gcd(arr[i + 1], arr[i]);
            arr[i + 1] = (arr[i] * arr[i + 1]) / num;
        }
        return arr[arr.length - 1];
    }
}