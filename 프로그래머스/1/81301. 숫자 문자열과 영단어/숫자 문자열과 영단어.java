import java.util.*;
class Solution {
    static String[] alph = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public int solution(String s) {
        String answer = "";
        String tmp = "";
        List <String> alpha = new ArrayList<>();
        for(String i : alph) alpha.add(i);
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                tmp = "";
                answer+=String.valueOf(c);
            }
            else{
                tmp+=String.valueOf(c);
                int a_idx = alpha.indexOf(tmp);
                if(a_idx != -1){
                    answer+=String.valueOf(a_idx);
                    tmp = "";
                }
            }
        }
        return Integer.parseInt(answer);
    }
}