import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    int tmp = i + j + k;
                    map.put(tmp, map.getOrDefault(tmp, 0) + 1);
                }
            }
        }

        List<Integer> keySet =  new ArrayList<>(map.keySet());
        keySet.sort((x, y) -> map.get(y) - map.get(x));

        System.out.println(keySet.get(0));
    }
}