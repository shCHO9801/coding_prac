import java.util.*;

class Solution {
    public static String getBin(int n, int a){
        StringBuilder result = new StringBuilder();
        
        String s = Integer.toString(a, 2);
        if(s.length() < n){
            int need = n - s.length();
            while(need-- > 0){
                result.append('0');
            }
        }
        
        return result.append(s).toString();
    }
    
    public static String makeString(int n, int a, int b){
        StringBuilder result = new StringBuilder();
        
        char[] s1 = getBin(n, a).toCharArray();
        char[] s2 = getBin(n, b).toCharArray();
        
        for(int i = 0; i < n; i++){
            if(s1[i] == '1' || s2[i] == '1'){
                result.append('#');
            } else {
                result.append(' ');
            }
        }
        
        return result.toString();
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            answer[i] = makeString(n, arr1[i], arr2[i]);
        }
        
        return answer;
    }
}