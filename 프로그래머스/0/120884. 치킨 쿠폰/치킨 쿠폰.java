class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int cup = chicken;
        chicken = 0;
        while(true){
            if(chicken == 0 && (int)(cup / 10) == 0)
                break;
            answer += chicken;
            cup += chicken;
            chicken = (int)(cup/10);
            cup %= 10;
        }
        
        return answer;
    }
}