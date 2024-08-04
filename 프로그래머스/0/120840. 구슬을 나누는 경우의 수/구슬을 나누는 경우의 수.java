import java.math.*;
class Solution {
    public int solution(int balls, int share) {
        BigInteger n = new BigInteger("1");
        BigInteger nm = new BigInteger("1");
        BigInteger m = new BigInteger("1");
        BigInteger tmp;
        for(int i = 2;i <= balls; i++){
            tmp = new BigInteger(String.valueOf(i));
            n = n.multiply(tmp);
        }
        for(int i = 2;i <= balls-share; i++){
            tmp = new BigInteger(String.valueOf(i));
            nm = nm.multiply(tmp);
        }
            
        for(int i = 2; i <= share; i++){
            tmp = new BigInteger(String.valueOf(i));
            m = m.multiply(tmp);
        }
        nm = nm.multiply(m);
        n = n.divide(nm);
        
        return n.intValue();
    }
}

