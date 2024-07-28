import java.util.*;
import java.io.*;
public class Main{
    static int T,X;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while(T-->0){
            List<Character> list = new ArrayList<>();
            X = Integer.parseInt(br.readLine());
            String s = Integer.toString(X);
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if(!list.contains(tmp))
                    list.add(tmp);
            }
            System.out.println(list.size());
        }
    }
}