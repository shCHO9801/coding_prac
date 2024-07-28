import java.util.*;
class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length();i++){
            char tmp = myString.charAt(i);
            if(tmp == 'a' || tmp == 'A')
                answer+='A';
            else
                answer+=String.valueOf(Character.toLowerCase(tmp));
        }
        return answer;
    }
}