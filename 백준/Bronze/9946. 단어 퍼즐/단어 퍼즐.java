import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int T = 0;

        while (true) {
            String s1 = br.readLine();
            String s2 = br.readLine();
            if (s1.equals(s2) && s1.equals("END")) {
                break;
            }

            T++;
            answer.append("Case ")
                    .append(T)
                    .append(": ");

            s1 = Arrays.stream(s1.split(""))
                    .sorted()
                    .collect(Collectors.joining());
            s2 = Arrays.stream(s2.split(""))
                    .sorted()
                    .collect(Collectors.joining());
            answer.append(s1.equals(s2) ? "same" : "different")
                    .append('\n');
        }
        System.out.println(answer);
    }
}