import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            String a = br.readLine();
            String b = br.readLine();

            int diff = 0;

            for(int i = 0; i < a.length(); i++) {
                if(a.charAt(i) != b.charAt(i)) diff++;
            }

            appendAnswer(diff, answer);
        }

        System.out.println(answer);
    }

    private static void appendAnswer(int diff, StringBuilder answer) {
        answer.append("Hamming distance is ")
                .append(diff)
                .append(".\n");
    }
}