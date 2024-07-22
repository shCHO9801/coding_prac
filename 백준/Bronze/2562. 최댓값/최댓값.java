import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int max = 0;
        for(int i=0;i<9;i++){
            int x = sc.nextInt();
            if(i == 0) {
                max = x;
            }
            else if(max < x)
                max = x;
            al.add(x);
        }
        System.out.println(max);
        System.out.println(al.indexOf(max)+1);
    }
}