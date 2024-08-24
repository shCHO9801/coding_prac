import java.util.*;
import java.io.*;
import java.nio.*;
public class Main {
    static StringTokenizer st;
    static int N, K, count;
    static int[] arr;

    public static void heapSort(int[] arr){
        buildMinHeap(arr, arr.length - 1);
        for(int i = N; i >= 2; i--){
            swap(arr, 1, i);
            heapify(arr, 1, i - 1);
        }
    }

    public static void buildMinHeap(int[] arr, int n){
        for(int i = n / 2; i >= 1; i--){
            heapify(arr, i, n);
        }
    }

    public static void heapify(int[] arr, int k, int n){
        int left = 2 * k;
        int right = 2 * k + 1;
        int min;
        if(right <= n){
            if(arr[left] < arr[right]){
                min = left;
            }
            else{
                min = right;
            }
        }
        else if(left <= n){
            min = left;
        }
        else{
            return ;
        }

        if(arr[min] < arr[k]){
            swap(arr, min, k);
            heapify(arr, min, n);
        }
    }

    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        count++;

        if(count == K){
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.toString());
            System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        heapSort(arr);
        System.out.println(-1);
        br.close();
    }
}