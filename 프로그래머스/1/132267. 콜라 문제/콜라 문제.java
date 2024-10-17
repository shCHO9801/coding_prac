class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int bottle = 0;
        
        while(n != 0){
            bottle += n;
            n = (bottle / a) * b;
            bottle %= a;
            answer += n;
        }
        
        return answer;
    }
}