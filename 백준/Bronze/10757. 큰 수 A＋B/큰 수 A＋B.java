import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    static BigInteger a,b;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        a = new BigInteger(st.nextToken());
        b = new BigInteger(st.nextToken());
        System.out.println(a.add(b));
    }
}