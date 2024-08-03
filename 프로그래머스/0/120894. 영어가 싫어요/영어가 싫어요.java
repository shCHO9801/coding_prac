import java.util.*;
class Solution {
    public long solution(String numbers) {
        String answer = "";
        String tmp = "";
        String[] dic = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0;i < numbers.length();i++){
            char x = numbers.charAt(i);
            tmp += String.valueOf(x);
            if(tmp!=""){
                int val = Arrays.asList(dic).indexOf(tmp);
                if(val != -1){
                    answer += String.valueOf(val);
                    tmp = "";
                }
            }
        }
        return Long.parseLong(answer);
    }
}
