import java.util.stream.Collectors;
class Solution {
    public long solution(long n) {
        return Long.parseLong(
            String.valueOf(n)
            .chars()
            .mapToObj(i -> (char) i)
            .sorted((x, y) -> y - x)
            .map(String::valueOf)
            .collect(Collectors.joining())
        );
    }
}