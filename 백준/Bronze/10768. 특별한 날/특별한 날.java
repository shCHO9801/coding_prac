import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        if(m<2){
            System.out.println("Before");
            return;
        }
        if(m>2){
            System.out.println("After");
            return;
        }
        int d = Integer.parseInt(br.readLine());
        if(d == 18){
            System.out.println("Special");
            return;
        }
        if(d<18){
            System.out.println("Before");
            return;
        }
        System.out.println("After");
    }
}