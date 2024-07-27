import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int min_idx, max_idx;
    static int[] d,m,y;
    static String[] name;
    public static void make_arr(int n){
        d = new int [n];
        m = new int [n];
        y = new int [n];
        name = new String[n];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        make_arr(n);
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            d[i] = sc.nextInt();
            m[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        min_idx = max_idx = 0;
        for (int i = 1; i < n; i++) {
            if(y[min_idx]>y[i]){
                min_idx = i;
            }
            else if(y[min_idx] == y[i]){
                if(m[min_idx] > m[i])
                    min_idx = i;
                else if(m[min_idx] == m[i])
                    if(d[min_idx] > d[i])
                        min_idx = i;
            }
            if(y[max_idx]<y[i]){
                max_idx = i;
            }
            else if(y[max_idx] == y[i]){
                if(m[max_idx] < m[i])
                    max_idx = i;
                else if(m[max_idx] == m[i])
                    if(d[max_idx] < d[i])
                        max_idx = i;
            }
        }
        System.out.println(name[max_idx]);
        System.out.println(name[min_idx]);
    }
}