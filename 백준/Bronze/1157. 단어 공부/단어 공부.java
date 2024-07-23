import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int max = 0, count = 0;
        List<Character> answer = new ArrayList<>();
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if(Character.isLowerCase(tmp))
                tmp = (char)(tmp-'a'+'A');
            hm.put(tmp, hm.getOrDefault(tmp, 0)+1);
            max = Math.max(max, hm.get(tmp));
        }
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            if(entry.getValue() == max)
                answer.add(entry.getKey());
        }
        if(answer.size() > 1)
            System.out.println('?');
        else
            System.out.println(answer.get(0));
    }
}