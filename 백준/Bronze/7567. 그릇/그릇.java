import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int answer = 10;
        for(int i = 1; i<s.length();i++){
            if(s.charAt(i-1) == s.charAt(i))
                answer+=5;
            else answer+=10;
        }
        System.out.println(answer);
    }
}