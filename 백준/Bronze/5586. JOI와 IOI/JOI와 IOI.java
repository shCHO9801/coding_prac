import java.util.*;
import java.io.*;
public class Main{
    static int ioi,joi;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = 0; i < s.length()-2; i++) {
            String tmp = "";
            for (int j = i; j < i+3; j++) {
                tmp += s.charAt(j);
            }
            if(tmp.equals("IOI"))
                ioi++;
            if(tmp.equals("JOI"))
                joi++;
        }
        System.out.println(joi);
        System.out.println(ioi);
    }
}