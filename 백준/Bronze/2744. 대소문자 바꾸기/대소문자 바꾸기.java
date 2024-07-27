import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char tmp = str.charAt(i);
            if(Character.isLowerCase(tmp))
                System.out.print(Character.toUpperCase(tmp));
            else
                System.out.print(Character.toLowerCase(tmp));
        }
    }
}