import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        int n = in.nextInt(), answer = 0;
        while(n-->0){
            String checker = "";
            s = in.next();
            int i = 0;
            char cur = '1';
            for (; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if(i==0)
                    cur = tmp;
                else{
                    if(cur == tmp)
                        continue;
                    else{
                        if(checker.contains(tmp+""))
                            break;
                        else cur = tmp;
                    }
                }
                checker += cur;
            }
            if(i == s.length())
                answer++;
        }
        System.out.println(answer);
    }
}