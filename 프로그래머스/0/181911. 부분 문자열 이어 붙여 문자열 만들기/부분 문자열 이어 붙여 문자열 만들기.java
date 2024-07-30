import java.nio.*;
class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(int[] p : parts){
            String tmp = my_strings[idx++].substring(p[0],p[1]+1);
            sb.append(tmp);
        }
        return sb.toString();
    }
}