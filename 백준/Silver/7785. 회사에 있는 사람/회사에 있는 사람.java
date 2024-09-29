import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List <String> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        Map <String, String> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());


        while(n-- > 0){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();

            map.put(name, status);
        }

        for(String key : map.keySet()){
            if(map.get(key).equals("enter")){
                answer.add(key);
            }
        }

        Collections.sort(answer);

        for(int i = answer.size() - 1; i >= 0; i--){
            sb.append(answer.get(i)).append('\n');
        }

        System.out.println(sb.toString());
    }
}