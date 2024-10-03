import java.util.*;
import java.io.*;

class Main{
    static StringTokenizer st;
    static Map <Integer, Integer> map = new HashMap<>();

    public static int getToken(){
        if(!st.hasMoreTokens()) return 0;
        return Integer.parseInt(st.nextToken());
    }

    public static void getArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int x = getToken();
            map.put(x, map.getOrDefault(x, 0)+ 1);
            arr[i] = x;
        }
    }

    public static int getResult(int[] arr){
        int result = 0;
        for(int i : arr) if(map.get(i) == 1) result ++;
        return result;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        int lenA = getToken();
        int lenB = getToken();

        int[] a = new int[lenA];
        int[] b = new int[lenB];

        st = new StringTokenizer(br.readLine());
        getArray(a);
        st = new StringTokenizer(br.readLine());
        getArray(b);

        int answer = getResult(a) + getResult(b);
        System.out.println(answer);
    }
}