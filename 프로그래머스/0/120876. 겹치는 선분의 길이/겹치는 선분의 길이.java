class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[202];
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        
        for(int[] l : lines){
            int s = l[0] + 100;
            int e = l[1] + 100;
            minVal = Math.min(minVal, s);
            maxVal = Math.max(maxVal, e);
            for(int i = s; i < e; i++){
                arr[i]++;
            }
        }
        
        for(int i = minVal; i <= maxVal; i++){
            if(arr[i] > 1){
                answer++;
            }
        }
        return answer;
    }
}