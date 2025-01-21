import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String s = br.readLine();
            int l = 0;
            int r = s.length() - 1;
            boolean flag = false;

            while (l < r){
                if(s.charAt(l) == s.charAt(r)) {
                    flag = true;
                } else {
                    flag = false;
                }
                l++;
                r--;
            }

            answer.append("Do-it")
                    .append(flag ? "\n" : "-Not\n");
        }

        System.out.println(answer);
    }
}