import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            String s = br.readLine();
            char tmp = s.charAt(0);
            if(Character.isLowerCase(tmp))
                tmp = Character.toUpperCase(tmp);
            System.out.print(tmp);
            for (int i = 1; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}