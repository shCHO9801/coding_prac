import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                System.out.print(Character.toLowerCase(s.charAt(i)));
            }
            System.out.println();
        }
    }
}