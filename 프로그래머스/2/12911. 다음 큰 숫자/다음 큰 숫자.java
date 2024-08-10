class Solution {
    static int countOne (int n){
        int answer = 0;
        while(n!=0){
            if(n%2==1)
                answer++;
            n/=2;
        }
        return answer;
    }
    public int solution(int n) {
        int answer = n+1;
        int nCount = countOne(n);
        int aCount = countOne(answer);
        while(nCount != aCount){
            aCount = countOne(++answer);
        }
        return answer;
    }
}