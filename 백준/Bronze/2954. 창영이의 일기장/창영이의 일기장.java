import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        s = s.replace("apa","a");
        s = s.replace("epe","e");
        s = s.replace("ipi","i");
        s = s.replace("opo","o");
        s = s.replace("upu","u");

        System.out.println(s);
    }
}