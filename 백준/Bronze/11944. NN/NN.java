import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        List<Character> list = new ArrayList<>();
        int m = sc.nextInt();
        int t = Integer.parseInt(n);
        while(t-->0){
            for (int i = 0; i < n.length(); i++) {
                char tmp = n.charAt(i);
                list.add(tmp);
            }
        }
        if(list.size() >= m) {
            for (int i = 0; i < m; i++) {
                System.out.print(list.get(i));
            }
        }
        else
            for(char i : list)
                System.out.print(i);
    }
}