import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int max = 0;
        List<List<Integer>> graph = new ArrayList<>();
        
        for(int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int[] e : edge) {
            int a = e[0];
            int b = e[1];
            
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        dist[1] = 0;
        
        while(!q.isEmpty()) {
            int cur = q.poll();
            
            for(int next : graph.get(cur)) {
                if(dist[next] != -1) continue;
                
                dist[next] = dist[cur] + 1;
                q.offer(next);
                max = Math.max(max, dist[next]);
            }
        }
        
        int answer = 0;
        
        for(int i : dist) {
            if(i == max) answer++;
        }
        return answer;
    }
}