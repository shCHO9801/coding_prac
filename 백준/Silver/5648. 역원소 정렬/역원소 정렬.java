import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        List<String> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        while(list.size() < n) {
            while(st.hasMoreTokens()) {
                StringBuilder sb = new StringBuilder();
                sb.append(st.nextToken());
                list.add(sb.reverse().toString());
            }
            if(list.size() < n) {
                st = new StringTokenizer(br.readLine());
            }
        }

        List<String> tmp = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            int idx = 0;
            String s = list.get(i);
            while(s.charAt(idx++) == '0');
            tmp.add(s.substring(idx - 1));
        }

        Collections.sort(tmp, (x, y) -> {
            if(x.length() == y.length()) {
                return x.compareTo(y);
            } else {
                return x.length() - y.length();
            }
        });

        for(String s : tmp) {
            answer.append(s)
                    .append('\n');
        }

        System.out.println(answer);
    }
}