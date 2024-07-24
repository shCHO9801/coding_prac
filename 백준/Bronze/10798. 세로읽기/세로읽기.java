import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Character>[] list = new ArrayList[15];
        for (int i = 0; i < 15; i++) {
            list[i] = new ArrayList<Character>();
        }
        for (int i = 0; i < 5; i++) {
            String s = in.next();
            for(int j = 0;j < s.length();j++){
                list[j].add(s.charAt(j));
            }
        }
        for(int i =0;i<15;i++){
            int idx=0;
            while(list[i].size() > idx)
                if(list[i].size()!=0){
                    System.out.print(list[i].get(idx++));
                }
        }
    }
}