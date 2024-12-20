import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static private int parseInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        int n = parseInt(br.readLine());

        while(n-- > 0) {
            String title = br.readLine();
            map.put(title, map.getOrDefault(title, 0) + 1);
        }

        List<String> keys = new ArrayList<>(map.keySet());

        keys.sort((x, y) -> {
            if (map.get(x).equals(map.get(y))) {
                return x.compareTo(y);
            } else {
                return map.get(y) - map.get(x);
            }
        });

        System.out.println(keys.get(0));
    }
}
