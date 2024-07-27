import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] tmp = s.split("");
        Arrays.sort(tmp, Comparator.reverseOrder());
        for(String i : tmp)
            System.out.print(i);
    }
}