import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int count = 0;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int i = a;i<=b;i++){
                String tmp = Integer.toString(i);
                for (int j = 0; j < tmp.length(); j++) {
                    if(tmp.charAt(j) == '0') count++;
                }
            }
            System.out.println(count);
        }
    }
}