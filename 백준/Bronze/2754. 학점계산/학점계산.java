import java.util.*;
public class Main {
    static Scanner in = new Scanner(System.in);
    public static float subGrade(char s){
        if(s == '+') return 0.3f;
        if(s == '-') return -0.3f;
        return 0;
    }
    public static float score(String grade){
        float result = 0;
        char tmp = grade.charAt(0);
        if(tmp == 'F') return 0;
        if(tmp == 'A')
            result = 4;
        if(tmp == 'B')
            result = 3;
        if(tmp == 'C')
            result = 2;
        if(tmp == 'D')
            result = 1;
        return result + subGrade(grade.charAt(1));
    }
    public static void main(String[] args) {
        String s = in.next();
        System.out.println(score(s));
    }
}