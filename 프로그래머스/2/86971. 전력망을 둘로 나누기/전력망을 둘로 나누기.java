class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n + 1];
            int count = dfs(1, i, visited, wires);
            int diff = Math.abs((n - count) - count);
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    private int dfs(int node, int skip, boolean[] visited, int[][] wires) {
        int count = 1;
        visited[node] = true;
        
        for(int i = 0; i < wires.length; i++) {
            if(i == skip) continue;
            
            int a = wires[i][0];
            int b = wires[i][1];
            
            if(a == node && !visited[b]) {
                count += dfs(b, skip, visited, wires);
            } else if(b == node && !visited[a]) {
                count += dfs(a, skip, visited, wires);
            }
        }
        
        return count;
    }
}