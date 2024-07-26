import java.util.*;
import java.io.*;
public class Main {
    static int N;
    static int r,e,c;
    static StringTokenizer st;
    static String[] answer = {"advertise", "do not advertise", "does not matter"};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        while(N-->0){
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(r>e-c)
                System.out.println(answer[1]);
            else if(r == e-c)
                System.out.println(answer[2]);
            else
                System.out.println(answer[0]);
        }
    }
}