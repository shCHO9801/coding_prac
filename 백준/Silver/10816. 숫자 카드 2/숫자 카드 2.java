import java.util.*;
import java.nio.*;
import java.io.*;

public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        Map <Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        while(m-- > 0){
            int x = Integer.parseInt(st.nextToken());
            answer.append(map.getOrDefault(x, 0)).append(' ');
        }
        System.out.println(answer.toString());
    }
}