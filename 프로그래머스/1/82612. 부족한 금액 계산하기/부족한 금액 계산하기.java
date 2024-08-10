class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int idx = 1;
        while(idx <= count){
            answer+=(long)(price*idx++);
        }
        answer -= money;
        return answer<0?0:answer;
    }
}