import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = 5, count = 0, idx = 1;
        while(n-->0){
            String s = sc.nextLine();
            if(s.contains("FBI")) {
                count++;
                System.out.print(idx + " ");
            }
            idx++;
        }
        if(count == 0)
            System.out.println("HE GOT AWAY!");
    }
}