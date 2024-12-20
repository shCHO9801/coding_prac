import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        Set<String> set = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0) {
            String cmd = br.readLine();
            if(cmd.equals("ENTER")) {
                set = new HashSet<>();
                continue;
            }

            if(!set.contains(cmd)) {
                answer++;
                set.add(cmd);
            }
        }

        System.out.println(answer);
    }
}