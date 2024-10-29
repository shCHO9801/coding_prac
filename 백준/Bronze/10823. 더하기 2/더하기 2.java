import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 0;

        while(true){
            String s = br.readLine();
            if(s==null){
                break;
            }
            sb.append(s);
        }

        for(String st : sb.toString().split(",")){
            answer += Integer.parseInt(st);
        }

        System.out.println(answer);
        br.close();
    }
}