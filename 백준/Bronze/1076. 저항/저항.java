import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Data {
    Integer val;
    Integer mul;

    public Data(Integer val, Integer mul) {
        this.val = val;
        this.mul = mul;
    }
}

public class Main {
    public static Map<String, Data> makeDatas() {
        Map<String, Data> result = new HashMap<>();
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int mul = 1;
        for (int i = 0; i < color.length; i++) {
            result.put(color[i], new Data(i, mul));
            mul *= 10;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Data> datas = makeDatas();
        Long answer = 0L;

        for (int i = 0; i < 3; i++) {
            String color = br.readLine();
            if (i != 2) {
                answer = answer * 10 + datas.get(color).val;
            } else {
                answer *= datas.get(color).mul;
            }
        }

        System.out.println(answer);
    }
}