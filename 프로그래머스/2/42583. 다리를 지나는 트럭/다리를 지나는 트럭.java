import java.util.*;

class Solution {
    public class Info {
        int time;
        int weight;
        
        public Info (int time, int weight) {
            this.time = time;
            this.weight = weight;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int idx = 0;
        int total = 0;
        
        Queue<Info> q = new LinkedList<>();
        
        while(true) {
            if(q.isEmpty() && idx == truck_weights.length) break;
            
            time++;
            
            if(!q.isEmpty() && time - q.peek().time >= bridge_length) {
                Info car = q.poll();
                total -= car.weight;
            }
            
            if (idx < truck_weights.length && truck_weights[idx] + total <= weight) {
                Info car = new Info(time, truck_weights[idx]);  
                idx++;
                q.add(car);
                total += car.weight;
            }
        }
        
        return time;
    }
}