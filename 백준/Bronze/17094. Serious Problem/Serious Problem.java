import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int tCount = 0;
        int eCount = 0;

        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == '2') {
                tCount++;
            } else if (s.charAt(i) == 'e') {
                eCount++;
            }
        }
        
        if(tCount == eCount) {
            System.out.println("yee");
        } else if (tCount > eCount) {
            System.out.println("2");
        } else {
            System.out.println("e");
        }
    }
}