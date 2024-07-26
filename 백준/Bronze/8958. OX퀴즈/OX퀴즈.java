import java.util.*;
import java.io.*;
public class Main {
    static StringTokenizer st;
    static int N;
    static String s;
    static int score = 1;
    static int answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        while(N-->0){
            answer = 0;
            score = 1;
            s = br.readLine();
            for(int i=0;i<s.length();i++){
                char tmp = s.charAt(i);
                if(tmp=='X'){
                    score = 1;
                    continue;
                }
                if(tmp=='O'){
                    answer+=score++;
                }
            }
            System.out.println(answer);
        }
    }
}