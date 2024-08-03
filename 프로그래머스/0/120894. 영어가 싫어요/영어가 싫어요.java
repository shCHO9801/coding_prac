import java.util.*;
class Solution {
    public long solution(String numbers) {
        String answer = "";
        String tmp = "";
        String[] dic = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0;i<numbers.length();i++){
            tmp += String.valueOf(numbers.charAt(i));
            if(tmp!=""){
                if(Arrays.asList(dic).indexOf(tmp)!=-1){
                    answer+=Arrays.asList(dic).indexOf(tmp);
                    tmp = "";
                }
            }
        }
        return Long.parseLong(answer);
    }
}