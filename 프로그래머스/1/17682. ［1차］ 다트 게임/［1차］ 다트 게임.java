class Solution {
    static int[] score = new int[3];
    static int idx = 0;
    static void makeScore(String curScore, String s){
        int result = Integer.parseInt(curScore);
        score[idx] = result;
        if(s.equals("D")){
            score[idx] = (int)Math.pow(result, 2);
        }
        else if(s.equals("T")){
            score[idx] = (int)Math.pow(result, 3);
        }
        idx++;
    }
    
    public int solution(String dartResult) {
        int answer = 0;    
        String curScore = "";
        for(String s : dartResult.split("")){
            if(s.equals("*")){
                if(idx - 2 >= 0){
                    score[idx -2] *= 2;
                }
                score[idx - 1] *= 2;
            }
            else if(s.equals("#")){
                score[idx - 1] *= -1;
            }
            else if(s.equals("S") || s.equals("D") || s.equals("T")){
                makeScore(curScore, s);
                curScore = "";
            }
            else{
                curScore += s;
            }
        }
        for(int i = 0; i < 3; i++){
            answer += score[i];
        }
        return answer;
    }
}