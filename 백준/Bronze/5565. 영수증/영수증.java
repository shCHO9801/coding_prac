import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] books = new int[9];
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            books[i] = Integer.parseInt(br.readLine());
            sum+=books[i];
        }
        System.out.println(total-sum);
    }

}