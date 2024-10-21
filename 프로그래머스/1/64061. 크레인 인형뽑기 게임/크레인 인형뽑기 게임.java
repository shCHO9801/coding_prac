import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Stack<Integer>> boardStack = new ArrayList<>();
        Stack<Integer> tmp = new Stack<>();
        
        boardStack.add(new Stack<>());
        
        for(int j = 0; j < board[0].length; j++){
            Stack<Integer> st = new Stack<>();
            for(int i = board.length - 1; i >= 0; i--){
                if(board[i][j] != 0){
                    st.push(board[i][j]);
                }
            }
            boardStack.add(st);
        }
        
        int prev = 0;
        
        for(int m : moves){
            if(boardStack.get(m).isEmpty()) continue;
            int cur = boardStack.get(m).pop();
            
            if(!tmp.isEmpty() && tmp.peek() == cur){
                tmp.pop();
                answer+=2;
            } else {
                tmp.push(cur);
            }
        }
        return answer;
    }
}