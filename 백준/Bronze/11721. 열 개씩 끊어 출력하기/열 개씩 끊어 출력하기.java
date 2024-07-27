import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if(i%10 == 0 && i!=0)
                System.out.println();
            System.out.print(s.charAt(i));
        }
    }
}