import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] mirror = new String[n];

        for (int i = 0; i < n; i++) {
            mirror[i] = br.readLine();
        }

        int k = Integer.parseInt(br.readLine());
        if(k == 1) {
            for (int i = 0; i < n; i++) {
                answer.append(mirror[i])
                        .append('\n');
            }
        } else if (k == 2) {
            for (int i = 0; i < n; i++) {
                for(int j = n - 1; j >=0 ; j--) {
                    answer.append(mirror[i].charAt(j));
                }
                answer.append('\n');
            }
        } else {
            for (int i = n - 1; i >= 0; i--) {
                for(int j = 0; j < n; j++) {
                    answer.append(mirror[i].charAt(j));
                }
                answer.append('\n');
            }
        }

        System.out.println(answer);
    }
}