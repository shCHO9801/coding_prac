import java.util.stream.LongStream;
class Solution {
    public long[] solution(int x, int n) {
        return LongStream.range(0, n)
            .map(i -> x * (i + 1))
            .toArray();
    }
}