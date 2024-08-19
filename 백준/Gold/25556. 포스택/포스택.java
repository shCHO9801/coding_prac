import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static int N;
    static StringTokenizer st;
    static ArrayList<ArrayList<Integer>> stList = new ArrayList<>();
    static int[] arr;
    static final int stackNum = 4;

    static void makeStack(int n){
        for(int i = 0; i < n; i++){
            stList.add(new ArrayList<>());
        }
    }



    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean answer = true;
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        makeStack(stackNum);

        for(int x : arr){
            int idx = 0;
            while(true){
                ArrayList<Integer> tmp = stList.get(idx);
                if(tmp.isEmpty() || tmp.get(tmp.size() - 1) < x){
                    stList.get(idx).add(x);
                    break;
                }
                else{
                    idx++;
                }
                if (idx >= 4){
                    answer = false;
                    break;
                }
            }
            if(!answer){
                break;
            }
        }

        System.out.println(answer ? "YES" : "NO");

    }
}