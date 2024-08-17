class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = 0;
        for(int i = 0; i < answer.length; i++){
            answer[i] = i + 1;
            sum += answer[i];
        }
        while(sum != total){
            if(sum < total){
                sum = 0;
                for(int i = 0; i < answer.length; i++){
                    answer[i]++;
                    sum += answer[i];
                }
            }
            else{
                sum = 0;
                for(int i = 0; i < answer.length; i++){
                    answer[i]--;
                    sum += answer[i];
                }
            }
        }
        
        return answer;
    }
}