import java.io.*;

class Main{
    public static boolean getYN(String ss){
        int cnt = 0;
        for(String s : ss.split("")){
            if(s.equals("(")) {
                cnt++;
            } else {
                if(cnt == 0) return false;
                else cnt--;
            }
        }
        return cnt == 0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        while(n-- > 0){
            String x = br.readLine();
            answer.append(getYN(x) ? "YES" : "NO").append('\n');
        }

        System.out.println(answer);
    }
}