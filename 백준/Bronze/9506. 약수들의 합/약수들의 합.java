import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int n = in.nextInt();
            if(n==-1) break;
            int sum = 0;
            List <Integer> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if(n%i==0){
                    list.add(i);
                    sum+=i;
                }
            }
            System.out.print(n + " ");
            if(sum == n) {
                System.out.print("= ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if (i < list.size() - 1) System.out.print(" + ");
                }
            }
            else{
                System.out.print("is NOT perfect.");
            }
            System.out.println();
        }
    }
}