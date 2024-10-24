import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0, idx = 0, len = jobs.length, time = 0;
        
        Queue<int[]> pq = new PriorityQueue<>((x, y) -> x[1] - y[1]);
        Arrays.sort(jobs, (x, y) -> x[0] - y[0]);
        
        while(!pq.isEmpty() || idx < len){
            while(idx < len && jobs[idx][0] <= time){
                pq.add(jobs[idx++]);
            }
            if(pq.isEmpty()){
                time = jobs[idx][0];
            } else {
                int[] job = pq.poll();
                time += job[1];
                answer += time - job[0];
            }
        }
        
        
        return answer / len;
    }
}