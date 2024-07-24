import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int bin = in.nextInt();
        Map<Character,Integer> m = new HashMap<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            int val = i-'A'+10;
            m.put(i,val);
        }
        int mul = 1;
        int answer = 0;
        for (int i = s.length()-1; i >=0 ; i--) {
            char tmp = s.charAt(i);
            int x = 0;
            if(Character.isUpperCase(tmp)){
                x = m.get(tmp);
            }
            else{
                x = Integer.parseInt(tmp+"");
            }
            answer += x*mul;
            mul*=bin;
        }
        System.out.println(answer);
    }
}