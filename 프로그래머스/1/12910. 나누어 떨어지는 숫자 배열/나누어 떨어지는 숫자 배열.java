import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> x - y);
        List<Integer> answer = new ArrayList<>();
        
        IntStream.of(arr).forEach(x -> pq.add(x));
        
        while(!pq.isEmpty()){
            int cur = pq.poll();
            if(cur % divisor == 0) answer.add(cur);
        }
        
        return answer.size() == 0 ? new int[]{-1} : answer.stream().mapToInt(x -> x).toArray();
    }
}