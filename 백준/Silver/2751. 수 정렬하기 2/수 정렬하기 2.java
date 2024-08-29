import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] countingSort = new int[2000004];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(n-- > 0){
            int x = Integer.parseInt(br.readLine()) + 1000000;
            max = Math.max(x, max);
            min = Math.min(x, min);
            countingSort[x]++;
        }

        for(int i = min; i <= max; i++){
            if(countingSort[i] == 1){
                System.out.println(i - 1000000);
            }
        }

    }
}