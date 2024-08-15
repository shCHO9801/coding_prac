import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (x, y) -> {
            char diff1 = x.charAt(n);
            char diff2 = y.charAt(n);
            if(diff1 == diff2){
                return x.compareTo(y);
            }
            else{
                return diff1 - diff2;
            }
        });
        return strings;
    }
}