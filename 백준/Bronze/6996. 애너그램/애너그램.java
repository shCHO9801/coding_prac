import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            sb.append(a).append(" & ").append(b).append(" are ");

            if(!isAnagram(a, b)) {
                sb.append("NOT ");
            }
            sb.append("anagrams.\n");
        }

        System.out.println(sb);
    }

    private static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();

        Arrays.sort(aa);
        Arrays.sort(bb);

        for (int i = 0; i < aa.length; i++) {
            if(aa[i] != bb[i]) {
                return false;
            }
        }
        return true;
    }
}