import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap <String, Integer> map = new HashMap<>();
        for(char i = 'A'; i <= 'Z'; i++){
            map.put(String.valueOf(i),101);
        }
        
        
        for(String key : keymap){
            int idx = 1;
            for(String k : key.split("")){
                int cur = map.get(k);
                if(cur > idx){
                    map.put(k, idx);
                }
                idx++;
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            for(String key : targets[i].split("")){
                if(map.get(key) == 101){
                    answer[i] = -1;
                    break;
                }
                answer[i] += map.get(key);
            }
        }
        
        return answer;
    }
}