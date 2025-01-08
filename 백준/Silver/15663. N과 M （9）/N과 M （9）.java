import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        boolean[] visited = new boolean[n];
        List<Integer> tmp = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        backTracking(n, m, arr, visited, tmp, sb);

        System.out.print(sb);
    }

    private static void backTracking(int n, int m, int[] arr, boolean[] visited, List<Integer> tmp, StringBuilder sb) {
        if(tmp.size() == m) {
            for(int i=0; i<m; i++) {
                sb.append(tmp.get(i)).append(' ');
            }
            sb.setLength(sb.length() - 1); // 마지막 공백 제거
            sb.append('\n');
            return;
        }

        for(int i=0; i<n; i++) {
            if(visited[i]) continue;

            if(i > 0 && arr[i] == arr[i-1] && !visited[i-1]) continue;

            visited[i] = true;
            tmp.add(arr[i]);
            backTracking(n, m, arr, visited, tmp, sb);
            tmp.remove(tmp.size() - 1);
            visited[i] = false;
        }
    }
}
