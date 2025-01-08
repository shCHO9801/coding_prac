import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int[] arr;
    static boolean[] visited;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        StringBuilder answer = new StringBuilder();
        List<Integer> tmp = new ArrayList<>();

        setUp();
        backTracking(m,  tmp, answer);

        System.out.println(answer);
    }

    private static void backTracking(int m, List<Integer> tmp, StringBuilder answer) {
        if(m == tmp.size()) {
            for (int i = 0; i < m; i++) {
                answer.append(tmp.get((i)));
                if(i < m - 1) {
                    answer.append(' ');
                }
            }
            answer.append('\n');
            return;
        }
        for (int i = 0; i < n; i++) {
            if(visited[i]) {
                continue;
            }
            if(i > 0 && arr[i - 1] == arr[i] && !visited[i - 1]) {
                continue;
            }
            tmp.add(arr[i]);
            visited[i] = true;

            backTracking(m, tmp, answer);

            visited[i] = false;
            tmp.remove(tmp.size() - 1);
        }
    }

    private static void setUp() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
    }

}