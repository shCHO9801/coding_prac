import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] asc = new int[9];
        int[] desc = new int[9];
        boolean ascFlag = true;
        boolean descFlag = true;
        for (int i = 1; i < 9; i++) {
            asc[i] = sc.nextInt();
        }
        for (int i = 1; i < 9; i++) {
            if(i!=asc[i]) {
                ascFlag = false;
                break;
            }
        }
        if(ascFlag) {
            System.out.println("ascending");
            return ;
        }
        int idx=1;
        for (int i = asc.length-1; i > 0 ; i--) {
            desc[idx++] = asc[i];
        }
        for (int i = 1; i < desc.length; i++) {
            if(desc[i] != i){
                descFlag = false;
                break;
            }
        }
        if(descFlag){
            System.out.println("descending");
            return;
        }
        System.out.println("mixed");
    }
}