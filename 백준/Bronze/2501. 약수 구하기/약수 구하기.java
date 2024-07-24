import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int cnt = 0, num = 1;
        while(true){
            if(n%num==0)
                cnt++;
            if(cnt==k){
                System.out.println(num);
                break;
            }
            if(num == n){
                System.out.println(0);
                break;
            }
            num++;
        }
    }
}