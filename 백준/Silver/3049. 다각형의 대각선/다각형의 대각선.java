import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        System.out.println(n * (n-1) * (n-2) * (n-3) / 24);
    }
}