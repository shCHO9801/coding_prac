import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static int[][] makeRoom(int n, int k){
        int[][] rooms = new int[7][2];
        while(n-->0){
            int sex = in.nextInt();
            int grade = in.nextInt();
            rooms[grade][sex]++;
        }
        return rooms;
    }
    public static void main(String[] args) {
        int n = in.nextInt();
        int k = in.nextInt();
        int answer = 0;
        int[][] rooms = makeRoom(n,k);
        for(int[] r : rooms){
            for(int x : r){
                if(x%k==0)
                    answer+=x/k;
                else
                    answer+=x/k+1;
            }
        }
        System.out.println(answer);
    }
}