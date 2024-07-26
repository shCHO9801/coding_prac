import java.util.*;
import java.io.*;
public class Main{
    static StringTokenizer st1, st2;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st1 = new StringTokenizer(br.readLine(), ":");
        st2 = new StringTokenizer(br.readLine(), ":");
        int[] time = new int[3];
        for (int i = 0; i < 3; i++) {
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            time[i] = b-a;
        }
        if(time[2] < 0) {
            time[2] += 60;
            time[1]--;
        }
        if(time[1] < 0){
            time[1] += 60;
            time[0]--;
        }
        if(time[0]<0)
            time[0]+=24;
        System.out.printf("%02d:%02d:%02d",time[0],time[1],time[2]);
    }
}