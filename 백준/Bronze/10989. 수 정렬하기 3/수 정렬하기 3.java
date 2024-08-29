import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        while(n-- > 0){
            int x = Integer.parseInt(br.readLine());
            arr[x]++;
        }

        for(int i = 1; i < arr.length; i++){
            while(arr[i]-- > 0){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}