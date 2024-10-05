import java.util.*;
import java.io.*;

class Main{
    static Map <String, String> map;

    public static boolean isTrue(String s){
        Stack <String> st = new Stack<>();

        for(String x : s.split("")){
            if(x.equals("[") || x.equals("(")){
                st.push(x);
            } else if (x.equals(")") || x.equals("]")){
                if(st.isEmpty() || !st.pop().equals(map.get(x))){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        map = new HashMap<>();
        map.put("]", "[");
        map.put(")", "(");
        while(true){
            String s = br.readLine();
            if(s.equals(".")) break;

            answer.append(isTrue(s) ? "yes" : "no").append('\n');
        }
        System.out.println(answer);
    }
}