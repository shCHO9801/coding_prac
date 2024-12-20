import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static private int parseInt(String s) {
        return Integer.parseInt(s);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> A = new HashSet<>();
        Set<String> B = new HashSet<>();

        int count = 0;
        List<String> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        int n = parseInt(st.nextToken());
        int m = parseInt(st.nextToken());

        while(n-- > 0) {
            String name = br.readLine();
            A.add(name);
        }

        while(m-- > 0) {
            String name = br.readLine();
            if(A.contains(name)) {
                count++;
                list.add(name);
            }
        }
        
        Collections.sort(list);
        StringBuilder answer = new StringBuilder();

        answer.append(count).append("\n");
        for(String name : list) {
            answer.append(name).append("\n");
        }

        System.out.print(answer);
    }
}