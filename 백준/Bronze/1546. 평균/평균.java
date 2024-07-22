import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = -1;
        int[] score = new int[n];
        for(int i=0;i<n;i++) {
            score[i] = sc.nextInt();
            if(m<score[i]) m = score[i];
        }
        double answer = 0;
        for(int v : score){
            answer+=(double)v/m*100;
        }
        System.out.println(answer/n);
    }
}