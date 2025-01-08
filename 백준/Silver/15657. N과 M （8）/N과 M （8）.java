import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[] arr;
    static int n;
    static int m;
    static StringBuilder answer;
    static List<Integer> tmp;

    public static void main(String[] args) throws IOException {
        setUp();
        backTracking(0, m, tmp, answer);

        System.out.println(answer);
    }

    private static void backTracking(int start, int m, List<Integer> tmp, StringBuilder answer) {
        if(m == tmp.size()) {
            for(int i = 0; i < m; i++) {
                answer.append(tmp.get(i));
                if(i < m - 1) {
                    answer.append(' ');
                }
            }
            answer.append('\n');
            return;
        }
        for (int i = 0; i < n; i++) {
            if(i < start) continue;
            tmp.add(arr[i]);

            backTracking(i, m, tmp, answer);

            tmp.remove(tmp.size() - 1);
        }
    }

    private static void setUp() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        answer = new StringBuilder();
        tmp = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
    }
}