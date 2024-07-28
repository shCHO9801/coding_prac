import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            int[] arr = new int[4];
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if(Character.isLowerCase(tmp))
                    arr[0]++;
                else if(Character.isUpperCase(tmp))
                    arr[1]++;
                else if(Character.isDigit(tmp))
                    arr[2]++;
                else if(tmp == ' ')
                    arr[3]++;
            }
            for(int i : arr)
                System.out.print(i + " ");
            System.out.println();
        }

    }
}