import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Long, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            Long x = Long.parseLong(br.readLine());
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        long answer = -1;
        int maxCount = 0;

        for(Map.Entry<Long, Integer> entry : map.entrySet()) {
            long num = entry.getKey();
            int count = entry.getValue();

            if(count > maxCount) {
                maxCount = count;
                answer = num;
            } else if (count == maxCount) {
                if(num < answer) {
                    answer = num;
                }
            }
        }

        System.out.println(answer);
    }
}
