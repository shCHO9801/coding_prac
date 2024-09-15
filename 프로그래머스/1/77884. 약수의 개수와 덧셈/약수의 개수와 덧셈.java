class Solution {
    public int get(int n){
        int result = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                result++;
            }
        }
        return result;
    }
    public int solution(int left, int right) {
        int answer = 0;
        while(left <= right){
            int tmp = get(left);
            
            if(tmp % 2 == 0){
                answer += left;
            } else {
                answer -= left;
            }
            left++;
        }
        
        return answer;
    }
}