import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int bin = in.nextInt();
        Map<Integer, Character> m = new HashMap<>();
        Character alpha = 'A';
        for (int i = 10; i <= bin; i++) {
            m.put(i,alpha++);
        }
        String answer = "";
        while(n != 0){
            int tmp = n%bin;
            n/=bin;
            if(tmp > 9){
                answer+=m.get(tmp);
            }
            else{
                answer+=tmp+"";
            }
        }
        StringBuilder result = new StringBuilder(answer);
        System.out.println(result.reverse());
    }
}