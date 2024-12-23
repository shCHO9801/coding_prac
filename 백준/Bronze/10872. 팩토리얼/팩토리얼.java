import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(f(n));
    }
    private static int f(int depth) {
        if(depth <= 1) {
            return 1;
        }
        return depth * f(depth - 1);
    }
}