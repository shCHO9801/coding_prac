import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static Queue<Integer> makeQ(int n){
        Queue<Integer>tmp = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            tmp.add(i);
        }
        return tmp;
    }
    public static int[] makeJosephus(Queue<Integer>q,int k){
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            int tmp = 0;
            for (int i = 0; i < k-1; i++) {
                q.add(q.remove());
            }
            list.add(q.remove());
        }
        return list.stream().mapToInt(i->i).toArray();
    }
    public static void printAnswer(int[] arr){
        System.out.print("<");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1)
                System.out.print(", ");
        }
        System.out.print(">");
    }
    public static void main(String[] args) {
        Queue<Integer> q;
        int n = in.nextInt();
        int k = in.nextInt();
        q = makeQ(n);
        int[] josephus = makeJosephus(q,k);
        printAnswer(josephus);
    }
}