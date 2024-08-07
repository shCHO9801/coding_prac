import java.util.*;
class Solution {
    public String solution(String s) {
        List <Character> list = new ArrayList<>();
        for(int i = 0; i < s.length();i++){
            list.add(s.charAt(i));
        }
        Collections.sort(list, (x,y)->{
            return y-x;
        });
        String answer = "";
        for(char i : list){
            answer += String.valueOf(i);
        }
        
        return answer;
    }
}