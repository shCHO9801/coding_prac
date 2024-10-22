class Solution {
    public int solution(int n) {
        int answer = 0;
        long sum = 0;
        
        int l = 0, r = 0;
        while(l != n || r != n){
            if(sum < n){
                r++;
                sum += r;
            } else if (sum == n){
                answer++;
                l++;
                sum -= l;
            } else {
                l++;
                sum -= l;
            }
        }
        return answer;
    }
}