class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] cArr = my_string.toCharArray();
        
        for(int[] q : queries){
            int x = q[0];
            int y = q[1];
            while(x < y){
                char tmp = cArr[x];
                cArr[x] = cArr[y];
                cArr[y] = tmp;
                x++;
                y--;
            }
        }
        answer = String.valueOf(cArr);
        return answer;
    }
}