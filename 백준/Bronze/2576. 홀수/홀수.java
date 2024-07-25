import java.net.Inet4Address;
import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static int sum(List<Integer> arr){
        return arr.stream().mapToInt(i->i).sum();
    }
    public static int min(List<Integer> arr){
        Collections.sort(arr);
        return arr.get(0);
    }
    public static void main(String[] args) {
        int n = 7;
        List <Integer>list = new ArrayList<>();
        while(n-->0){
            int x = in.nextInt();
            if(x%2==1)
                list.add(x);
        }
        if(list.size() == 0)
            System.out.println(-1);
        else{
            System.out.println(sum(list));
            System.out.println(min(list));
        }
    }
}