import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int day = 0;
        int index = 0;
        int len = progresses.length;
        
        while(index < len) {
            int count = 0;
            
            while(progresses[index] + day * speeds[index] < 100) {
                day++;
            }
            
            while(index < len && progresses[index] + speeds[index] * day >= 100) {
                count++;
                index++;
            }
            list.add(count);
        }
        
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}