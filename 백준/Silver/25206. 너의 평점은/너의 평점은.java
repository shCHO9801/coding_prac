import java.util.*;
public class Main {
    public static boolean isMain(String Grade){
        return Grade.charAt(0) != 'P';
    }
    public static double GradeScore(String Grade){
        if(Grade.equals("A+"))
            return 4.5;
        if(Grade.equals("A0"))
            return 4;
        if(Grade.equals("B+"))
            return 3.5;
        if(Grade.equals("B0"))
            return 3;
        if(Grade.equals("C+"))
            return 2.5;
        if(Grade.equals("C0"))
            return 2;
        if(Grade.equals("D+"))
            return 1.5;
        if(Grade.equals("D0"))
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Subject = 20;
        double answer = 0;
        double sumOfSubject = 0;
        while(Subject-->0){
            String name = in.next();
            double score = in.nextDouble();
            String Grade = in.next();
            if(isMain(Grade)){
                sumOfSubject += score;
                answer += score * GradeScore(Grade);
            }
        }
        System.out.println(answer/sumOfSubject);
    }
}