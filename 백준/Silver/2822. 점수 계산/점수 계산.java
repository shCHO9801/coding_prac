import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 8;
        List<Integer> arr = new ArrayList<>();
        List<Integer> sortArr = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            arr.add(x);
            sortArr.add(x);
        }
        Collections.sort(sortArr);
        for (int i = sortArr.size()-5; i < sortArr.size(); i++) {
            answer.add(sortArr.get(i));
        }

        int sum = 0;
        for(int i : answer) sum+=i;

        System.out.println(sum);
        for(int i : arr)
            if(answer.contains(i)){
                System.out.print(arr.indexOf(i)+1 + " ");
            }
    }
}