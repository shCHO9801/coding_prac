import java.nio.*;
import java.io.*;
import java.util.*;
public class Main{
    static int n;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        List <Integer> arr = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            Integer x = Integer.parseInt(st.nextToken());
            if(arr.contains(x))
                continue;
            arr.add(x);
        }
        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i: arr)
            sb.append(i + " ");
        System.out.println(sb);
    }
}