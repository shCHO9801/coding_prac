class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] tmp = my_string.toCharArray();
        for(int[] p : queries){
            int idx = 0;
            int s = p[0];
            int e = p[1];
            char[] reverse = new char[e-s+1];
            for(int i = e;i>=s;i--){
                reverse[idx++] = tmp[i];
            }
            idx = 0;
            for(int i = s;i<=e;i++){
                tmp[i] = reverse[idx++];
            }
        }
        return String.valueOf(tmp);
    }
}