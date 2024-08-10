import java.math.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        BigInteger a;
        BigInteger b = new BigInteger(p);
        for(int i = 0; i < t.length() - p.length() + 1; i++){
            String tmp = t.substring(i, i+p.length());
            a = new BigInteger(tmp);
            if(a.compareTo(b) == -1 || a.compareTo(b) == 0) answer++;
        }
        return answer;
    }
}