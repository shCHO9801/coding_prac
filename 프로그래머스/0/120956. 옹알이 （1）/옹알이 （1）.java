import java.util.*;
class Solution {
    static final String[] babb = {"aya", "ye", "woo", "ma"};
    static boolean isBabb(String s){
        int[] count = new int[babb.length];
        String tmp = "";
        
        for(String c : s.split("")){
            tmp += c;
            int idx = Arrays.asList(babb).indexOf(tmp);
            if(idx != -1){
                if(count[idx] >= 1){
                    return false;
                }
                count[idx]++;
                tmp = "";
            }
        }
        if(!tmp.equals(""))
            return false;
        return true;
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