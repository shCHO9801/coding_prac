import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i < t+1; i++) {
            String s = br.readLine();
            System.out.printf("%d. %s\n",i,s);
        }
    }
}