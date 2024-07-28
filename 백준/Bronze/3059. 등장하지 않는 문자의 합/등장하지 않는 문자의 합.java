import java.nio.Buffer;
import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count;
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            int answer = 0;
            count = new int[26];
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                int tmp = s.charAt(i) - 'A';
                count[tmp]++;
            }
            for (int i = 0; i < count.length; i++) {
                if(count[i] == 0)
                    answer+=i+'A';
            }
            System.out.println(answer);
        }
    }
}