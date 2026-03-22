import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        Queue<int []> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            
            for(int i = 0; i < 4; i++) {
                int x = dx[i] + cur[0];
                int y = dy[i] + cur[1];
                
                if(0 <= x && x < n && 0 <= y && y < m) {
                    if(maps[x][y] == 1) {
                        maps[x][y] += maps[cur[0]][cur[1]];
                        q.add(new int[] {x, y});
                    }
                }
            }
        }
        
        return maps[n - 1][m - 1] == 1 ? -1 : maps[n - 1][m - 1];
    }
}