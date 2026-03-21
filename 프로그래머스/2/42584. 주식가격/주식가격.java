class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < len - 1; i++) {
            answer[i] = func(i + 1, prices[i], len, prices);
        }
        
        return answer;
    }
    
    private int func(int idx, int price, int len, int[] prices) {
        if (idx >= len) return 0;
        if (prices[idx] < price) return 1;
        return func(idx + 1, price, len, prices) + 1;
    }
}