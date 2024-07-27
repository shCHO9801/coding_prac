import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    static String a,b;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = br.readLine();
            if(s.equals("END"))
                break;
            for (int i = s.length()-1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}