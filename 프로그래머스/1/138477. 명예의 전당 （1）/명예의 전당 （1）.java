import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        int idx = 0;
        
        for(int s : score){
            pq.add(s);
            while(pq.size() > k){
                pq.poll();
            }
            answer[idx++] = pq.peek();
        }
        
        
        return answer;
    }
}