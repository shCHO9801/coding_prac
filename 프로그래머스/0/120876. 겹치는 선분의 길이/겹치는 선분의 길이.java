class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[202];
        int min = 201;
        int max = -1;
        for(int[] l : lines){
            for(int i = l[0]; i < l[1]; i++){
                count[i + 100]++;
                min = Math.min(min, i + 100);
                max = Math.max(max, i + 100);
            }
        }
        for(int i = min; i <= max; i++){
            if(count[i] >= 2){
                answer++;
            }
        }
        return answer;
    }
}