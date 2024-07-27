import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int len = 7, sum = 0;
            int min = Integer.MAX_VALUE;
            List <Integer> list = new ArrayList<>();
            while (len-->0){
                int x = sc.nextInt();
                if(x%2==0)
                    list.add(x);
            }
            for(int i : list){
                min = Math.min(min,i);
                sum += i;
            }
            System.out.printf("%d %d\n",sum, min);
        }
    }
}