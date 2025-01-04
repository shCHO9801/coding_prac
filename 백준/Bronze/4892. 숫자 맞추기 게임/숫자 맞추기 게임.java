import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        StringBuilder answer = new StringBuilder();

        while(true) {
            int x = Integer.parseInt(br.readLine());
            if(x == 0) {
                break;
            }
            answer.append(i++);
            x *= 3;
            answer.append(x % 2 == 0 ? ". even " : ". odd ");
            if(x % 2 == 0) {
                x /= 2;
            } else {
                x = (x + 1) / 2;
            }
            x = x * 3 / 9;
            answer.append(x).append('\n');
        }

        System.out.println(answer);
    }
}