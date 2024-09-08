class Solution {
    static int[][] answer;
    static int cnt;
    static int si, sj, ei, ej;
    
    static void setVal(int dir){
        if(dir == 0){
             for(int j = sj; j <= ej; j++){
                answer[si][j] = cnt++;
            }
            si++;
        } else if(dir == 1){
            for(int i = si; i <= ei; i++){
                answer[i][ej] = cnt++;
            }
            ej--;
        } else if(dir == 2){
            for(int j = ej; j >= sj; j--){
                answer[ei][j] = cnt++;
            }
            ei--;
        } else{
            for(int i = ei; i >= si; i--){
                answer[i][sj] = cnt++;
            }
            sj++;
        }
    }
    public int[][] solution(int n) {    
        int dir = 0;
        answer = new int[n][n];
        si = 0; 
        sj = 0; 
        ei = n - 1; 
        ej = n - 1;
        
        for(cnt = 1; cnt <= n * n;){
            setVal(dir++ % 4);
        }
        
        return answer;
    }
}