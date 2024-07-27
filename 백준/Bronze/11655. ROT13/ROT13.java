import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(Character.isDigit(a) || a == ' ') {
                System.out.print(a);
                continue;
            }
            if(Character.isLowerCase(a)){
                a += 13;
                if(a > 'z')
                    a-=26;
            }
            else if (Character.isUpperCase(a)){
                a+=13;
                if(a > 'Z')
                    a-=26;
            }

            System.out.print((char)a);
        }

    }
}