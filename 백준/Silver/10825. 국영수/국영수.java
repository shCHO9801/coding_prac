import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<Data> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            list.add(new Data(name, kor, eng, math));
        }

        Collections.sort(list, (x, y) -> {
           if(x.kor != y.kor) {
               return y.kor - x.kor;
           } else {
               if(x.eng != y.eng) {
                   return x.eng - y.eng;
               } else {
                   if(x.math != y.math) {
                       return y.math - x.math;
                   } else {
                       return x.name.compareTo(y.name);
                   }
               }
           }
        });

        for(Data data : list) {
            answer.append(data.name)
                    .append('\n');
        }

        System.out.println(answer);
    }

    public static class Data {
        String name;
        int kor;
        int eng;
        int math;
        public Data (String name ,int kor, int eng, int math){
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }
}