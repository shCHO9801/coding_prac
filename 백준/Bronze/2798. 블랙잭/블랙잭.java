import java.util.*;
import java.io.*;
import java.nio.*;

public class Main {
    static StringTokenizer st;
    static int n, m;
    static int[] arr;

    public static void makeArr(int size){
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int answer = 0;
        makeArr(n);

        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                for(int k = j + 1; k < n; k++){
                    int tmp = arr[i] + arr[j] + arr[k];
                    if(tmp <= m){
                        answer = Math.max(answer, tmp);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}