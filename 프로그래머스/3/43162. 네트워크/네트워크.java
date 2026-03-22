class Solution {
    int answer = 0;
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                answer++;
                dfs(i, computers, n, visited);
            }
        }
        
        return answer;
    }
    
    private void dfs(int idx, int[][] computers, int n, boolean[] visited) {
        if(idx == n) return;
        
        for(int i = 0; i < n; i++) {
            if(computers[idx][i] == 1 && !visited[i]) {
                visited[idx] = true;
                dfs(i, computers, n, visited);
            }
            
        }
    }
}