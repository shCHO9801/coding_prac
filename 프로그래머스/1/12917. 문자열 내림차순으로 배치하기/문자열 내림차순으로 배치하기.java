import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        
        for(int i = cArr.length - 1; i >= 0 ;i--){
            sb.append(cArr[i]);
        }
        
        return sb.toString();
    }
}