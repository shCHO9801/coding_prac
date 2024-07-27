import java.util.*;
import java.io.*;
public class Main{
    static char[] aeiou = {'a','e','i','o','u'};
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            for(char a : aeiou)
                if(tmp == a)
                    count++;
        }
        System.out.println(count);
    }
}