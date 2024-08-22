import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        Map <String, Integer> map = new HashMap<>();
        int answer = 1;
        
        for(String[] tmp : clothes){
            String key = tmp[1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        for(String key : map.keySet()){
            answer *= map.get(key) + 1;
        }
        
        answer -= 1;
        return answer;
    }
}