import java.util.*;
public class Main {
    public static int[] count(int money){
        int[] coin = {25,10,5,1};
        for(int i=0;i<4;i++){
            if(money != 0) {
                int coins = coin[i];
                coin[i] = money / coins;
                money %= coins;
            }
            else
                coin[i] = 0;
        }
        return coin;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            int money = in.nextInt();
            int[] answer = count(money);
            for(int x : answer){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}