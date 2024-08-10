class Solution {
    public int solution(int n) {
        if(n == 1) return 1;
        int answer = 0;
        int left = 1, right = 2;
        int sum = 3;
        while(left <= right && left <= n){
            if(sum < n){
                right++;
                sum+=right;
            }
            else if(sum == n){
                answer++;
                sum-=left++;
            }
            else if (sum > n){
                sum-=left++;
            }
            
        }
        return answer;
    }
}