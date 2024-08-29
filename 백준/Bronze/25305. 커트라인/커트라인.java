import java.util.*;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt() - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(n-- > 0){
            list.add(sc.nextInt());
        }
        
        list.sort((x, y) -> y - x);
        System.out.println(list.get(k));
    }
}