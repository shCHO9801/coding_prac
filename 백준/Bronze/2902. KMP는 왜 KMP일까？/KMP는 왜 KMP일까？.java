import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int n = st.countTokens();
        for (int i = 0; i < n; i++) {
            char tmp = st.nextToken().charAt(0);
            System.out.print(tmp);
        }
    }
}