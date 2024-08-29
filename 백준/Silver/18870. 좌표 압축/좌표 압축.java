import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(st.nextToken());
            map.put(x, 1);
            list.add(x);
        }
        int idx = 0;
        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        for(Integer i : keys){
            map.put(i, idx++);
        }
        
        for(int i : list){
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}