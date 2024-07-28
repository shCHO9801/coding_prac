import java.nio.*;
import java.io.*;
import java.util.*;
public class Main{
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(tmp.contains(s))
                continue;
            tmp.add(s);
        }
        Collections.sort(tmp, (s1,s2) -> {
            if(s1.length()==s2.length())
                return s1.compareTo(s2);
            else
                return s1.length()-s2.length();
        });
        for(String i : tmp)
            System.out.println(i);
    }
}