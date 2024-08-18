class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int result = 0;
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
                continue;
            }
            for(int win : win_nums){
                if(win == lottos[i]){
                    result++;
                    break;
                }
            }
        }
        zero += result;
        System.out.print(zero + " " + result);
        answer[0] = 7 - zero == 7 ? 6 : 7 - zero;
        answer[1] = 7 - result == 7 ? 6 : 7 - result;
        return answer;
    }
}