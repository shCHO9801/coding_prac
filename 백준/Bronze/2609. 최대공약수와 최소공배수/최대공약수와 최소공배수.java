import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static int a,b;
    public static int getAnswer(){
        int answer = 1;
        int idx = 2;
        while(Math.max(a,b)>=idx){
            while(a%idx==0 && b%idx==0){
                answer*=idx;
                a/=idx;b/=idx;
            }
            idx++;
        }
        return answer;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        int answer1 = getAnswer();
        System.out.println(answer1);
        System.out.println(answer1*a*b);
    }

}