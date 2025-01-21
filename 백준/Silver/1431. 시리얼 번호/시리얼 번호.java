import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        List<Data> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            list.add(new Data(s));
        }

        Collections.sort(list, (x, y) -> {
            if(x.data.length() != y.data.length()) {
                return x.data.length() - y.data.length();
            } else {
                if(x.count != y.count) {
                    return x.count - y.count;
                } else {
                    return x.data.compareTo(y.data);
                }
            }
        });

        for(Data data : list) {
            answer.append(data.data)
                    .append('\n');
        }

        System.out.println(answer);
    }

    public static class Data {
        String data;
        int count;
        public Data (String data) {
            this.data = data;
            this.count = countDigit(this.data);
        }

        private int countDigit(String s) {
            int result = 0;

            for(char c : s.toCharArray()) {
                if(Character.isDigit(c)) {
                    result += c - '0';
                }
            }

            return result;
        }
    }
}