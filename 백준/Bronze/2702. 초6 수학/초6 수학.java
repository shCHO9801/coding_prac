import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int t,a,b;
    static int getAnswer(){
        int result = 1;
        int idx = 2;
        while(idx <= Math.max(a,b)){
            while(a%idx == 0 && b%idx==0){
                a/=idx;b/=idx;
                result *=idx;
            }
            idx++;
        }
        return result;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            int answer = getAnswer();
            System.out.printf("%d %d\n",answer*a*b, answer);
        }
    }
}