import java.util.*;

class Solution {
    public int solution(String s) {
        int len = s.length();
        int answer = len;
        
        for(int i = 1; i <= len / 2; i++) {
            String prev = "";
            StringBuilder sb = new StringBuilder();
            int curIndex = 0;
            int count = 0;
            
            while(curIndex + i <= len) {
                String curString = s.substring(curIndex, curIndex + i);
                
                if (prev.length() == 0){
                    prev = curString;
                    count++;
                    curIndex += i;
                } else if(prev.equals(curString)) {
                    curIndex += i;
                    count++;
                } else {
                    sb.append(count < 2 ? "" : count)
                        .append(prev);
                    prev = curString;
                    count = 1;
                    curIndex += i;
                }
            }
           
            if (!prev.isEmpty()) {
                sb.append(count < 2 ? "" : count).append(prev);
            }
            
            sb.append(s.substring(curIndex));
            answer = Math.min(answer, sb.length());
        }
        
        return answer;
    }
}