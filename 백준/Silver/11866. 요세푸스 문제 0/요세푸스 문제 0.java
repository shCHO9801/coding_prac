import java.util.*;
import java.io.*;

public class Main{
    public static String makeAnswer (List<Integer> list) {
        StringBuilder result = new StringBuilder();
        result.append("<");
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if(i != list.size() - 1){
                result.append(", ");
            }
        }
        result.append(">");
        return result.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue <Integer> queue = new LinkedList<>();
        List <Integer> list = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()){
            for(int i = 0; i < k - 1; i++){
                queue.add(queue.poll());
            }
            list.add(queue.poll());
        }

        System.out.println(makeAnswer(list));
    }
}