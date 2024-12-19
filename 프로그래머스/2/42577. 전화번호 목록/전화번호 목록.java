import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Set <String> set = new HashSet<>();
        
        for(String p : phone_book) {
            set.add(p);
        }
        
        for(String p : phone_book) {
            for(int i = 0; i < p.length(); i++){
                String tmp = p.substring(0, i);
                if(set.contains(tmp)) {
                    return false;
                }
            }
        }
        
        return true;
    }
}