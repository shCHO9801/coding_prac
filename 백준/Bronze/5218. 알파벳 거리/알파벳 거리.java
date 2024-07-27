import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static String a,b;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            b = st.nextToken();
            System.out.print("Distances: ");
            for (int i = 0; i < a.length(); i++) {
                int tmp = b.charAt(i) - a.charAt(i);
                if (tmp < 0)
                    tmp+=26;
                System.out.print(tmp+" ");
            }
            System.out.println();
        }


    }
}