import java.io.*;
import java.util.*;

public class Main {
    private static Map<Character, Integer> map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        setMap();
        while(true) {
            String s = br.readLine();
            if(s.equals("#")) {
                break;
            }
            answer.append(octo(s)).append('\n');
        }
        System.out.println(answer);
    }

    private static void setMap() {
        map = new HashMap<>();
        String octoNum = "-\\(@?>&%";
        for (int i = 0; i < octoNum.length(); i++) {
            map.put(octoNum.charAt(i), i);
        }
        map.put('/', -1);
    }

    private static Long octo(String s) {
        long mul = 1;
        long result = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            char tmp = s.charAt(i);
            result += mul * map.get(tmp);
            mul *= 8;
        }

        return  result;
    }
}