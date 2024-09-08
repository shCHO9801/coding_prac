import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dd = { a, b, c, d };
        Arrays.sort(dd);
        
        if(dd[0] == dd[3]){
            return 1111 * dd[3];
        }
        if(dd[1] == dd[3]){
            return (int)Math.pow((10 * dd[3] + dd[0]), 2);
        }
        if(dd[0] == dd[2]){
            return (int)Math.pow((10 * dd[0] + dd[3]), 2);
        }
        if(dd[0] == dd[1] && dd[2] == dd[3]){
            return (dd[0] + dd[2]) * Math.abs(dd[0] - dd[2]);
        }
        if(dd[0] == dd[1]){
            return dd[2] * dd[3];
        }
        if(dd[1] == dd[2]){
            return dd[0] * dd[3];
        }
        if(dd[2] == dd[3]){
            return dd[0] * dd[1];
        }
        
        return dd[0];
    }
}