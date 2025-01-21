import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        Map<Integer, Data> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            if(map.containsKey(x)) {
                Data data = map.get(x);
                data.count++;
                map.put(x, data);
            } else {
                map.put(x, new Data(1, i));
            }
            list.add(x);
        }

        list.sort((x, y) -> {
            if(map.get(x).count == map.get(y).count) {
                return map.get(x).idx - map.get(y).idx;
            } else {
                return map.get(y).count - map.get(x).count;
            }
        });

        for(int i : list) {
            answer.append(i).append(' ');
        }


        System.out.println(answer);
    }

    public static class Data {
        int count;
        int idx = Integer.MAX_VALUE;
        public Data(int count, int idx) {
            this.count = count;
            this.idx = idx;
        }
    }
}