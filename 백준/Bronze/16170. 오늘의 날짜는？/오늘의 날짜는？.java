import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now().minusHours(9);
        System.out.printf("%d\n%02d\n%02d",ldt.getYear(), ldt.getMonthValue(), ldt.getDayOfMonth());
    }
}