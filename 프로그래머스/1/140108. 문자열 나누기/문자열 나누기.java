import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] cArr = s.toCharArray();
        List <String> tmps = new ArrayList<>();
        StringBuilder tmp = new StringBuilder();
        
        char x = 'q';
        int xCount = 0, nCount = 0;
        
        for(int i = 0; i < cArr.length; i++){
            tmp.append(cArr[i]);
            if(tmp.length() == 1){
                x = cArr[i];    
            }
            
            if(x == cArr[i]){
                xCount++;
            } else {
                nCount++;
            }
            
            if(xCount == nCount){
                tmps.add(tmp.toString());
                tmp = new StringBuilder();
            }
        }
        
        if(tmp.length() != 0){
            answer++;
        }
        return answer + tmps.size();
    }
}