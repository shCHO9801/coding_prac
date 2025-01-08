import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        if(s.equals("0")){
            System.out.println(0);
            return;
        }

        for(char c : s.toCharArray()) {
            sb.append(toBin(c));
        }

        s = sb.toString();

        while(s.charAt(0) == '0') {
            s = s.substring(1, s.length());
        }
        System.out.println(s);
    }

    private static StringBuilder toBin(char c) {
        int n = c - '0';
        StringBuilder sb = new StringBuilder();

        while(n != 0) {
            sb.append(n%2);
            n/=2;
        }

        while(sb.length() < 3) {
            sb.append(0);
        }

        return sb.reverse();
    }
}