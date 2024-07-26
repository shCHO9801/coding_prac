import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    static int N;
    static int x,y;
    static int[] q;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        q = new int[5];
        N = Integer.parseInt(br.readLine());
        while(N-->0){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(x == 0 || y==0) q[0]++;
            else if(x > 0){
                if(y > 0) q[1]++;
                else q[4]++;
            }
            else{
                if(y > 0) q[2]++;
                else q[3] ++;
            }
        }
        for(int i=1;i<5;i++){
            System.out.printf("Q%d: %d\n",i,q[i]);
        }
        System.out.printf("AXIS: %d",q[0]);
    }
}