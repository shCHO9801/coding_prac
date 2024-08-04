class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int tmp = 1;
        while(tmp<sides[0]+sides[1]){
            int max = Math.max(sides[0], sides[1]);
            int min = Math.min(sides[0],sides[1]);
            if(tmp+min>max) answer++;
            else if(max+min < tmp) answer++;
            tmp++;
        }
        return answer;
    }
}