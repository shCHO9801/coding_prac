import java.util.*;
class Solution {
    public String solution(String polynomial) {
        int x = 0, y = 0;
        
        String[] tokens = polynomial.split(" ");
        for(String token : tokens){
            if(token.equals("+"))
                continue;
            String tmp;
            if(token.charAt(token.length()-1) == 'x'){
                if(token.length() == 1)
                    x++;
                else{
                    tmp = token.substring(0, token.length()-1);
                    x += Integer.valueOf(tmp);
                }
            }
            else{
                y += Integer.valueOf(token);
            }
        }
        StringBuilder sb = new StringBuilder();
        if(x > 0){
            if(x==1){
                sb.append("x");
            }
            else
                sb.append(x + "x");
            if(y > 0){
                sb.append(" + ");
            }
        }
        if(y > 0){
            sb.append(y);
        }
        return sb.toString();
    }
}