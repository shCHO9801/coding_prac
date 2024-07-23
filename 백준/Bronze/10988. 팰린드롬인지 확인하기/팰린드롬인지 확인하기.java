import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.println(0);
                return ;
            }
            left++;right--;
        }
        System.out.println(1);
    }
}