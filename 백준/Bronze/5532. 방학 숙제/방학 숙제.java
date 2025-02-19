import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        a = (a / c) + (a % c == 0 ? 0 : 1);
        b = (b / d) + (b % d == 0 ? 0 : 1);
        
        System.out.println(l - Math.max(a, b));
    }
}