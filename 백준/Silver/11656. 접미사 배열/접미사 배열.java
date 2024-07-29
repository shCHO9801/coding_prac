import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static List<String> answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        answer = new ArrayList<>();
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            String tmp = s.substring(i,s.length());
            answer.add(tmp);
        }
        Collections.sort(answer);
        StringBuilder sb = new StringBuilder();
        for(String i : answer)
            sb.append(i+"\n");
        System.out.println(sb);
    }
}