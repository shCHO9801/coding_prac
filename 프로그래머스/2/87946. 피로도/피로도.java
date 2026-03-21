class Solution {
    static int answer;
    public int solution(int k, int[][] dungeons) {
        answer = -1;
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(0, visited, dungeons, k);
        
        return answer;
    }
    
    private void dfs(int clear, boolean[] visited, int[][] dungeons, int k) {
        answer = Math.max(answer, clear);
        
        for(int i = 0; i < dungeons.length; i++) {
            if(visited[i]) continue;
            
            visited[i] = true;
            
            if(dungeons[i][0] <= k) {
                dfs(clear + 1, visited, dungeons, k - dungeons[i][1]);
            } else {
                dfs(clear, visited, dungeons, k);
            }
            
            visited[i] = false;
        }
    }
}