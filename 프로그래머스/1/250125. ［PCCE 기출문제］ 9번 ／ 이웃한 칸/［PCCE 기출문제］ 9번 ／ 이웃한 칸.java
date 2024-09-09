class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        
        for(int[] d : dir){
            int x = d[0] + h;
            int y = d[1] + w;
            if(0 <= x && x < board.length && 0 <= y && y < board[0].length){
                if(board[x][y].equals(board[h][w])){
                    answer++;
                }
            }
        }
        return answer;
    }
}