import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue <Integer> q = new LinkedList<>();
        Queue <Integer> idx = new LinkedList<>();
        ArrayList <Integer> rank = new ArrayList<>();
        
        int ii = 0;
        for(int i : priorities){
            q.add(i);
            idx.add(ii++);
            rank.add(i);
        }
        
        Collections.sort(rank, (x,y) -> y-x);
        while(true){
            answer++;
            int max = rank.get(0);
            rank.remove(0);
            while(q.peek() != max){
                q.add(q.poll());
                idx.add(idx.poll());
            }
            
            if(idx.peek() == location){
                break;
            }
            idx.poll();
            q.poll();
        }
        return answer;
    }
}