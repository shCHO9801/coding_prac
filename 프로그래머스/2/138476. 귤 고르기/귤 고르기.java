import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int need = k;
        
        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i : map.keySet()) {
            list.add(i);
        }
        
        list.sort((x,y) -> map.get(y) - map.get(x));
        
        for(int i : list) {
            answer++;
            if(need <= 0) break;
            int cnt = map.get(i);
            while(cnt-- > 0) {
                need--;
                if(need <= 0) break;
            }
            if(need <= 0) break;
        }
        
        
        
        return answer;
    }
}