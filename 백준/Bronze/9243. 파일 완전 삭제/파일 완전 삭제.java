import java.util.*;
import java.io.*;
public class Main{
    static void printDelS(){
        System.out.println("Deletion succeeded");
    }
    static void printDelF(){
        System.out.println("Deletion failed");
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String original = sc.next();
        String delete = sc.next();
        if(n%2==0){
            if (original.equals(delete))
                printDelS();
            else
                printDelF();
        }
        else{
            String tmp = "";
            for (int i = 0; i < original.length(); i++) {
                char t = original.charAt(i);
                if(t=='1')
                    tmp += Character.toString('0');
                else
                    tmp += Character.toString('1');
            }
            if(tmp.equals(delete))
                printDelS();
            else
                printDelF();
        }
    }
}