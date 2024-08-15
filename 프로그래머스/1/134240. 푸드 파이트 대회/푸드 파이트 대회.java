class Solution {
    public String solution(int[] food) {
        String answer = "";
        String end = "";
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i] / 2; j++){
                answer+=String.valueOf(i);
            }
        }
        for(int i = answer.length() - 1; i >= 0; i--){
            end += answer.charAt(i);
        }
        answer += "0" + end;
        return answer;
    }
}