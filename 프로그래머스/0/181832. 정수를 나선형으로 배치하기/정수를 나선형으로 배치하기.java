class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int cnt = 1;
        int si = 0;
        int sj = 0;
        int ei = n-1;
        int ej = n-1;
        
        while(cnt <= n*n){
            for(int j = sj; j <= ej; j++){
                answer[si][j] = cnt++;
            }
            si++;
            if(cnt > n * n) break;
            
            for(int i = si; i <= ei; i++){
                answer[i][ej] = cnt++;
            }
            ej--;
            if(cnt > n * n) break;
            
            for(int j = ej; j >= sj; j--){
                answer[ei][j] = cnt++;
            }
            ei--;
            if(cnt > n * n) break;
            
            for(int i = ei; i >= si; i--){
                answer[i][sj] = cnt++;
            }
            sj++;
            if(cnt > n * n) break;
        }
        return answer;
    }
}