import java.util.*;
import java.io.*;
public class Main{
    static int t;
    public static String make_binary(int n){
        List<Character> list = new ArrayList<>();
        while(n>0){
            list.add(((n%2)+"").charAt(0));
            n/=2;
        }
        String result = "";
        for (char c : list)
            result += c;
        return result;
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String binary = make_binary(n);
            for (int i = 0; i < binary.length(); i++) {
                if(binary.charAt(i) == '1')
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}