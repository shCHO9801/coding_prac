import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder answer = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        f(m, n, list, answer);

        System.out.println(answer);
    }

    private static void f(int depth, int n, List<Integer> list, StringBuilder answer) {
        if(depth == 0) {
            for(int i : list) {
                answer.append(i).append(' ');
            }
            answer.append('\n');
            return;
        }
        for(int i = 1; i < n + 1; i++) {
            list.add(i);
            f(depth - 1, n, list, answer);
            list.remove(list.size() - 1);
        }
    }
}