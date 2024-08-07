import java.util.*;
class Solution {
    public long solution(long n) {
        long x = (long)Math.sqrt(n);
        if((double)x == Math.sqrt(n))
            return (long)Math.pow(x+1,2);
        return -1;
    }
}