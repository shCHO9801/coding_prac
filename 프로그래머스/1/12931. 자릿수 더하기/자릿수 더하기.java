import java.util.stream.*;

public class Solution {
    public int solution(int n) {
        return IntStream.iterate(n, i -> i > 0, i -> i/10)
            .map(i -> i % 10)
            .sum();
    }
}