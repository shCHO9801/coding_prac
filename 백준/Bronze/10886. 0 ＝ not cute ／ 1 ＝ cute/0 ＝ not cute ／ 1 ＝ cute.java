import java.util.*;
import java.io.*;
public class Main {
    static int N;
    static int[] cute;
    static int x;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cute = new int[2];
        N = Integer.parseInt(br.readLine());
        while(N-->0){
            x = Integer.parseInt(br.readLine());
            cute[x]++;
        }
        System.out.print("Junhee is ");
        System.out.println(cute[0]>cute[1]?"not cute!":"cute!");
    }
}