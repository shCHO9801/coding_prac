class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 1;
        while(count < n){
            boolean check = true;
            answer++;
            count++;
            while(check){
                int x = answer;
                if(answer%3 == 0){
                    answer++;
                    continue;
                }            
                while(x > 0){
                    if(x % 10 == 3){
                        answer++;
                        break;
                    }
                    x/=10;
                }
                if(x == 0){
                    check = false;
                }
            }
        }
        
        return answer;
    }
}