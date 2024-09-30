import java.util.*;
import java.nio.*;
import java.io.*;

public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();


        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map <String, Integer> map = new HashMap<>();
        String[] nameDict = new String[n + 1];

        for(int i = 1; i <= n; i++){
            String name = br.readLine();
            map.put(name, i);
            nameDict[i] = name;
        }

        while(m-- > 0){
            String x = br.readLine();
            if(Character.isDigit(x.charAt(0))){
                answer.append(nameDict[Integer.parseInt(x)]).append('\n');
            } else {
                answer.append(map.get(x)).append('\n');
            }
        }

        System.out.println(answer.toString());
    }
}