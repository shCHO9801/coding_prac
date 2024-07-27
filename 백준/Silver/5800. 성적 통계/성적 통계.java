import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            System.out.println("Class " + i);
            String[] s = br.readLine().split(" ");
            int[] arr = new int[Integer.parseInt(s[0])];
            for (int j = 1; j < s.length; j++) {
                arr[j-1] = Integer.parseInt(s[j]);
            }
            Arrays.sort(arr);
            int max = arr[arr.length-1];
            int min = arr[0];
            int lg = -10;
            for (int j = 0; j < arr.length-1; j++) {
                lg = Math.max(lg, arr[j+1]-arr[j]);
            }
            System.out.printf("Max %d, Min %d, Largest gap %d\n", max, min, lg);
        }
    }
}