import java.nio.*;
import java.io.*;
import java.util.*;
public class Main{
    static StringTokenizer st;
    static int n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            switch(s){
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
                    break;
                case "pop":
                    if(stack.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty()?1:0);
                    break;
                case "top":
                    if(stack.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(stack.lastElement());
                    break;
                default:
                    System.out.println("Error");
            }
        }
    }
}