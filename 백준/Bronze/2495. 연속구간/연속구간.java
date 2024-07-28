import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 3;
        while(n-->0){
            int max = 0;
            String s = br.readLine();
            int count = 1;
            char prev = s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                if(prev == s.charAt(i)){
                    count++;
                }
                else{
                    max = Math.max(max,count);
                    prev = s.charAt(i);
                    count = 1;
                }
            }
            max = Math.max(max,count);
            System.out.println(max);
        }
    }
}