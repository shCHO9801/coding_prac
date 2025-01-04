import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        StringBuilder sb;

        int t = Integer.parseInt(br.readLine());
        List<String> list;

        while(t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            answer.append("Pairs for ").append(x).append(":");

            if(x == 2) {
                answer.append('\n');
                continue;
            }

            list = new ArrayList<>();


            for (int i = 1; i < x - i; i++) {
                sb = new StringBuilder();
                sb.append(i).append(' ').append(x - i);
                list.add(sb.toString());
            }

            for(int i = 0; i < list.size(); i++){
                answer.append(' ').append(list.get(i));
                if(i + 1 < list.size()) {
                    answer.append(',');
                }
            }
            answer.append('\n');
        }

        System.out.println(answer);
    }
}