import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map <String, Integer> map = new HashMap<>();
        
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                String tmp = String.valueOf(key.charAt(i));
                int val = i + 1;
                map.put(tmp, Math.min(map.getOrDefault(tmp, Integer.MAX_VALUE), val));
            }
        }
                        
        for(int idx = 0; idx < targets.length; idx++){
            String target = targets[idx];
            int result = 0;
            
            for(String s : target.split("")){
                int val = map.getOrDefault(s, -1);
                if(val == -1){
                    result = val;
                    break;
                }
                
                result += val;
            }
            answer[idx] = result;
        }
        
        return answer;
    }
}