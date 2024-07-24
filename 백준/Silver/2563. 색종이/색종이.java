import java.util.*;
public class Main {
    public static int count(int[][] arr){
        int answer = 0;
        for(int[] i : arr){
            for(int j : i){
                if(j==1)
                    answer+=1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[101][101];
        int t = in.nextInt();
        while(t-->0){
            int x = in.nextInt();
            int y = in.nextInt();
            for (int i = x; i < x+10; i++) {
                for (int j = y; j < y + 10; j++) {
                    arr[i][j] = 1;
                }
            }
        }
        int answer = count(arr);
        System.out.println(answer);
    }
}