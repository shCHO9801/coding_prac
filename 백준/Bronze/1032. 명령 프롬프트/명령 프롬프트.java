import java.nio.*;
import java.util.*;
import java.io.*;
public class Main{
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        char[] answer = br.readLine().toCharArray();
        for (int i = 0; i < n-1; i++) {
            char[] tmp = br.readLine().toCharArray();
            for (int j = 0; j < answer.length; j++) {
                if(answer[j] == '?') continue;
                if(answer[j] != tmp[j])
                    answer[j] = '?';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char i : answer)
            sb.append(i);
        System.out.println(sb);
    }
}