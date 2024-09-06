import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        String str = sc.next();

        for(String s : str.split("")){
            answer += Integer.parseInt(s);
        }

        System.out.println(answer);
    }
}