import java.util.*;
import java.io.*;
public class Main{
    static int avg, count_max;
    static int[] count = new int [101];
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = 10;
        while(n-->0){
            int x = sc.nextInt();
            avg+=x;
            count[x/10]++;
        }
        count_max = Arrays.stream(count).max().getAsInt();
        for (int i = 1; i < 101; i++) {
            if(count[i] == count_max){
                count_max = i*10;
                break;
            }
        }
        System.out.println(avg/10);
        System.out.println(count_max);


    }
}