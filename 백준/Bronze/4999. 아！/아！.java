import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = sc.next();
        System.out.println(s.length()<a.length()?"no":"go");
    }
}