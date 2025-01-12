import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder s = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        String input;

        while((input = br.readLine()) != null) {
            s.append(input);
        }

        for(char c : s.toString().toCharArray()) {
            if(c == ' ') continue;
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> keys = map.keySet().stream().collect(Collectors.toList());

        keys.sort((x, y) -> {
         if(map.get(x) == map.get(y)) {
             return x.compareTo(y);
         } else {
             return map.get(y) - map.get(x);
         }
        });

        int maxVal = map.get(keys.get(0));

        for (int i = 0; i < keys.size(); i++) {
            if (maxVal == map.get(keys.get(i))) {
                answer.append(keys.get(i));
            }
            else {
                break;
            }
        }

        System.out.println(answer);
    }
}