import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num=0;

        if(n%2==0) {
            num=(n/2+1)*(n/2+1);
        }else {
            num=(n/2+1)*(n/2+2);
        }

        System.out.println(num);
    }
}