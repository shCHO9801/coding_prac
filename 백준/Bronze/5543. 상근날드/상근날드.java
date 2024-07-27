import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];
        for (int i = 0; i < burger.length; i++) {
            burger[i] = sc.nextInt();
        }
        for (int i = 0; i < drink.length; i++) {
            drink[i] = sc.nextInt();
        }
        Arrays.sort(burger);
        Arrays.sort(drink);
        System.out.println(burger[0]+drink[0]-50);
    }
}