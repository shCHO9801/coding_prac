import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        while(true) {
            String s = br.readLine();
            if(s.equals("#")) {
                break;
            }
            answer.append(countIt(s.toLowerCase())).append('\n');

        }
        System.out.println(answer);
    }

    private static int countIt(String s) {
        int count = 0;
        final String VAL = "aeiou";

        for(String tmp : s.split("")){
            if(VAL.contains(tmp)) {
                count++;
            }
        }

        return count;
    }
}