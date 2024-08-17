class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    for(int x = -1; x <= 1; x++){
                        if(i + x < 0 || i + x >= board.length)
                            continue;
                        for(int y = -1; y <= 1; y++){
                            if(j + y < 0 || j + y >= board[i].length)
                                continue;
                            if(x == 0 && y == 0)
                                continue;
                            board[i + x][j + y] = board[i + x][j + y] == 0 ? 2 : board[i + x][j + y];
                        }
                    }
                }
            }
        }
        for(int[] i : board){
            for(int j : i){
                if(j == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}