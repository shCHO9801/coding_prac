import java.util.*;
import java.io.*;
class People{
    int age;
    String name;
    int idx;
    public People(int age, String name, int idx){
        this.age = age;
        this.name = name;
        this.idx = idx;
    }
}
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        ArrayList<People> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new People(age, name, i));
        }

        list.sort((x, y) -> {
            if(x.age == y.age){
                return x.idx - y.idx;
            } else{
                return x.age - y.age;
            }
        });

        for(People cur : list){
            sb.append(cur.age).append(" ").append(cur.name).append("\n");
        }

        System.out.println(sb);
    }
}