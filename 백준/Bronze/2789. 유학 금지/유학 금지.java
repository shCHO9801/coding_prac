import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cambridge = "CAMBRIDGE";
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if(cambridge.contains(String.valueOf(tmp)))
                continue;
            sb.append(tmp);
        }
        System.out.println(sb);
    }
}