import java.util.*;
import java.io.*;
public class Main {
    static int T, a, b, c;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        a = 300;
        b = 60;
        c= 10;
        a = T/a;
        T%=300;
        b = T/b;
        T%=60;
        c = T/c;
        T%=10;
        if(T!=0)
            System.out.println(-1);
        else
            System.out.printf("%d %d %d",a,b,c);
    }
}