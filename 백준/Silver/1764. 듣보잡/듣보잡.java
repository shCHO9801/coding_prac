import java.util.*;
import java.nio.*;
import java.io.*;

public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int answerCount = 0;
        Map <String, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n + m; i++) {
            String x = br.readLine();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        String[] key = new String[map.size()];

        int idx = 0;
        for(String k : map.keySet()){
            key[idx++] = k;
        }

        Arrays.sort(key);
        for(String k : key){
            if(map.get(k) == 2){
                answerCount++;
                answer.append(k).append('\n');
            }
        }

        System.out.println(answerCount);
        System.out.println(answer.toString());
    }
}