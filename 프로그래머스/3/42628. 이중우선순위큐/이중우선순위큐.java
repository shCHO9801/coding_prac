import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(String s : operations) {
            if(s.equals("D 1")) {
                if(map.isEmpty()) continue;
                
                int maxVal = map.lastKey();
                if(map.get(maxVal) > 1) {
                    map.put(maxVal, map.get(maxVal) - 1);
                } else {
                    map.remove(maxVal);
                }
            } else if (s.equals("D -1")) {
                if(map.isEmpty()) continue;
                
                int minVal = map.firstKey();
                if(map.get(minVal) > 1) {
                    map.put(minVal, map.get(minVal) - 1);
                } else {
                    map.remove(minVal);
                }
            } else {
                String[] data = s.split(" ");
                int val = Integer.parseInt(data[1]);
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }
        
        return map.isEmpty() ? new int[] {0, 0} : new int[] {map.lastKey(), map.firstKey()};
    }
}