import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] alpha = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(String tmp : alpha){
            if(s.contains(tmp)){
                s = s.replaceAll(tmp,"*");
            }
        }
        System.out.println(s.length());
    }
}