class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n + 1];
            int count = dfs(1, i, wires, visited);
            
            int diff = Math.abs(count - (n - count));
            answer = Math.min(diff, answer);
        }
        
        return answer;
    }

    private int dfs(int node, int skip, int[][] wires, boolean[] visited) {
        visited[node] = true;
        int count = 1;
        
        for(int i = 0; i < wires.length; i++) {
            if(i == skip) continue;
            
            int a = wires[i][0];
            int b = wires[i][1];
            
            if (node == a && !visited[b]) {
                count += dfs(b, skip, wires, visited);
            } else if(node == b && !visited[a]) {
                count += dfs(a, skip, wires, visited);
            }
        }
        
        return count;
    }
}