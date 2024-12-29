import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        List<Integer> list = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        f(0, 0, m, arr, visited, list, answer);

        System.out.println(answer);
    }

    private static void f(int depth, int start, int m, int[] arr, boolean[] visited, List<Integer> list, StringBuilder answer) {
        if(depth == m) {
            answer.append(getAnswer(list)).append('\n');
            return;
        }
        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);
            f(depth + 1, i, m, arr, visited, list, answer);
            list.remove(list.size() - 1);
        }
    }

    private static StringBuilder getAnswer(List<Integer> list) {
        StringBuilder result = new StringBuilder();
        for(int i : list) {
            result.append(i).append(' ');
        }
        return result;
    }
}
