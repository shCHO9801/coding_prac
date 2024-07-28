import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            tmp-=3;
            if(tmp < 'A')
                tmp+=26;
            System.out.print(tmp);
        }
    }
}