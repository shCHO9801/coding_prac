import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String even = "F.F.F.F.";
        String odd = ".F.F.F.F";
        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            if(i % 2 == 0) {
                answer += check(even, s);
            } else {
                answer += check(odd, s);
            }
        }
        System.out.println(answer);
    }
    private static int check(String a, String b) {
        int result = 0;

        for(int i = 0 ; i < 8; i++) {
            if(a.charAt(i) == 'F' && a.charAt(i) == b.charAt(i)) {
                result ++;
            }
        }
        return result;
    }
}