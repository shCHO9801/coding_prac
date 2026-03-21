class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                answer++;
                dfs(i, n, visited, computers);
            }
        }
        
        return answer;
    }
    
    private void dfs(int cur, int n, boolean[] visited, int[][] computers) {
        visited[cur] = true;
        
        for(int i = 0; i < n; i++) {
            if(!visited[i] && computers[cur][i] == 1) {
                dfs(i, n, visited, computers);
            }
        }
    }
}