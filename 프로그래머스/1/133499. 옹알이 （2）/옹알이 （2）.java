import java.util.*;
class Solution {
    static final String[] babb = {"aya", "ye", "woo", "ma"};
    static boolean isBabb(String s){
        int cur = -1;
        String tmp = "";
        for(String c : s.split("")){
            tmp += c;
            int idx = Arrays.asList(babb).indexOf(tmp);
            if(idx != -1){
                if(cur == idx){
                    return false;
                }
                tmp = "";
                cur = idx;
            }
        }
        if(tmp == "")
            return true;
        return false;
    }
    public int solution(String[] babbling) {
        int answer = 0;
        for(String s : babbling){
            if(isBabb(s)){
                answer++;
            }
        }
        return answer;
    }
}