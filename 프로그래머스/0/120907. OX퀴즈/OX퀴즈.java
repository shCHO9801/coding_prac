class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int a, b, result;
        for(int i = 0; i < quiz.length; i++){
            String[] tokens = quiz[i].split(" ");
            a = Integer.valueOf(tokens[0]);
            b = Integer.valueOf(tokens[2]);
            result = Integer.valueOf(tokens[4]);
            if(tokens[1].equals("+")){
                a += b;
            }
            else{
                a -= b;
            }
            answer[i] = a == result ? "O" : "X";
        }
        return answer;
    }
}