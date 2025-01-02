import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder answer = new StringBuilder();

        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        boolean[] prime = new boolean[e + 1];

        Arrays.fill(prime, true);
        prime[0] = prime [1] = false;
        for(int i = 2; i <= Math.sqrt(e); i++) {
            if(!prime[i]) continue;
            for(int j = i * i; j <= e; j += i) {
                prime[j] = false;
            }
        }

        while(s <= e) {
            if(prime[s]) {
                answer.append(s).append('\n');
            }
            s++;
        }

        System.out.println(answer);
    }
}