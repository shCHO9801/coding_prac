import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = -1;
        for (int i = a; i <= b; i++) {
            if(Math.sqrt(i) == (int)Math.sqrt(i)){
                if(min==-1) min = i;
                sum+=i;
            }
        }
        if(min != -1)
            System.out.println(sum);
        System.out.println(min);

    }
}