import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        while(n-->0){
            int x = sc.nextInt();
            if(x == 0) {
                if (!st.isEmpty())
                    st.pop();
            }
            else {
                st.push(x);
            }
        }
        long sum = 0;
        while(!st.isEmpty()) {
            sum += st.pop();
        }
        System.out.println(sum);
    }
}