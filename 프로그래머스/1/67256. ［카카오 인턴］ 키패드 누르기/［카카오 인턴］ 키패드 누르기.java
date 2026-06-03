class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int leftCurrent = 10;
        int rightCurrent = 12;
        
        for(int n : numbers) {
            if(n == 1 || n == 4 || n == 7) {
                answer += "L";
                leftCurrent = n;
            } else if (n == 3 || n == 6 || n == 9) {
                answer += "R";
                rightCurrent = n;
            } else {
                if (n == 0) n = 11;
                int status = checkNeerByHand(n, leftCurrent, rightCurrent);
                
                if (status == 0) {
                    if(hand.equals("left")) {
                        answer += "L";
                        leftCurrent = n;
                    } else {
                        answer += "R";
                        rightCurrent = n;
                    }
                } else if (status == 1) {
                    answer += "L";
                    leftCurrent = n;
                } else {
                    answer += "R";
                    rightCurrent = n;
                }
            }
        }
        
        return answer;
    }
    
    private static int checkNeerByHand(int n, int leftCurrent, int rightCurrent) {
        int leftCount = 0;
        int rightCount = 0;
        
        while(true) {
            if(leftCurrent == n) break;
            
            leftCount++;
            
            if(leftCurrent + 1 == n) {
                break;
            } else if(n < leftCurrent) {
                leftCurrent -= 3;
            } else {
                leftCurrent += 3;
            }
        }
        
        while(rightCurrent != n) {
            if(rightCurrent == n) break;
            
            rightCount++;
            
            if (rightCurrent - 1 == n) {
                break;
            } else if (n < rightCurrent) {
                rightCurrent -= 3;
            } else {
                rightCurrent += 3;
            }
        }
        
        if(leftCount == rightCount) return 0;
        return leftCount < rightCount ? 1 : 2;
    }
}