class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String dir : keyinput){
            if(dir.equals("left")){
                if(answer[0]-1 < -(board[0]/2))
                    continue;
                answer[0]--;
            }
            else if(dir.equals("right")){
                if(answer[0] >= (board[0]/2))
                    continue;
                answer[0]++;
            }
            else if(dir.equals("down")){
                if(answer[1]-1 < -(board[1]/2))
                    continue;
                answer[1]--;
            }
            else if(dir.equals("up")){
                if(answer[1] >= board[1]/2)
                    continue;
                answer[1]++;
            }
        }
        return answer;
    }
}