import java.util.*;
import java.io.*;
import java.nio.*;
public class Main{
    static StringTokenizer st;
    static int n,x,y;
    static int[][] arr;
    static int[] getResult (int[][] arr){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if(i==j) continue;
                if(x < arr[j][0] && y < arr[j][1])
                    count++;
            }
            result.add(count);
        }

        return result.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int i : getResult(arr))
            sb.append(i + " ");
        System.out.println(sb);
    }
}