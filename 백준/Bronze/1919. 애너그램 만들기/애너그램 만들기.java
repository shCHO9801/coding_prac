import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static int count_answer(char[] a, char[] b){
        int[]counter_a = new int[26];
        int[]counter_b = new int[26];
        for(char tmp : a){
            counter_a[tmp-'a']++;
        }
        for(char tmp : b){
            counter_b[tmp-'a']++;
        }
        for(int i=0;i<counter_a.length;i++){
            counter_a[i]-=counter_b[i];
            counter_a[i] = Math.abs(counter_a[i]);
        }
        int answer = 0;
        for(int n : counter_a)
            answer+=n;
        return answer;
    }
    public static void main(String[] args) {
        char[] a = in.next().toCharArray();
        char[] b = in.next().toCharArray();
        int answer = count_answer(a,b);
        System.out.println(answer);
    }
}