import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> truck = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++){
            q.add(0);
        }
        
        for(int i : truck_weights){
            truck.add(i);
        }
        
        int bridge = 0;
        
        while(!q.isEmpty()){
            answer++;
            bridge -= q.poll();
            
            if(!truck.isEmpty()){
                if(bridge + truck.peek() <= weight){
                    int next = truck.poll();
                    q.add(next);
                    bridge += next;
                } else {
                    q.add(0);
                }
            }
        }
        
        return answer;
    }
}