class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] count = new int[10];
        
        for(int n : numbers){
            count[n]++;
        }
        
        for(int i = 1; i < 10; i++){
            if(count[i] == 0){
                answer += i;
            }
        }
        
        return answer;
    }
}