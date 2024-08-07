import java.util.*;
class Solution {
    public long solution(long n) {
        List<Character> tmp = new ArrayList<>();
        String s = String.valueOf(n);
        for(int i = 0; i< s.length();i++){
            tmp.add(s.charAt(i));
        }
        Collections.sort(tmp, (x,y)->{
            return y-x;
        });
        s = "";
        for(Character i : tmp){
            s+=String.valueOf(i);
        }
        return Long.parseLong(s);
    }
}