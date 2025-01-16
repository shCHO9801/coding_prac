import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] types = {"RT", "CF", "JM", "AN"};
        
        // 각 문자에 대한 점수를 저장 (모든 점수를 0으로 초기화)
        Map<Character, Integer> scoreMap = new HashMap<>();
        scoreMap.put('R', 0);
        scoreMap.put('T', 0);
        scoreMap.put('C', 0);
        scoreMap.put('F', 0);
        scoreMap.put('J', 0);
        scoreMap.put('M', 0);
        scoreMap.put('A', 0);
        scoreMap.put('N', 0);
        
        // choices 점수 매핑, choices 번호 1 ~ 7에 대해
        // 1->3, 2->2, 3->1, 4->0, 5->1, 6->2, 7->3
        int[] scoreValues = {0, 3, 2, 1, 0, 1, 2, 3};
        
        // survey의 각 질문에 대하여 점수 누적
        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            int choice = choices[i];
            int score = scoreValues[choice];
            // survey[i]의 첫 문자는 '비동의' 측, 두 번째 문자는 '동의' 측
            if (choice < 4) { // 비동의 계열 → 첫번째 문자에 점수 추가
                char type = s.charAt(0);
                scoreMap.put(type, scoreMap.get(type) + score);
            } else if (choice > 4) { // 동의 계열 → 두번째 문자에 점수 추가
                char type = s.charAt(1);
                scoreMap.put(type, scoreMap.get(type) + score);
            }
            // choice == 4는 아무 점수도 추가하지 않음
        }
        
        // 각 지표별로 최종 유형 결정
        StringBuilder answer = new StringBuilder();
        for (String pair : types) {
            char first = pair.charAt(0);
            char second = pair.charAt(1);
            int scoreFirst = scoreMap.get(first);
            int scoreSecond = scoreMap.get(second);
            if (scoreFirst == scoreSecond) {
                // 동점인 경우 사전순으로 빠른 것을 선택
                answer.append(first < second ? first : second);
            } else if (scoreFirst > scoreSecond) {
                answer.append(first);
            } else {
                answer.append(second);
            }
        }
        
        return answer.toString();
    }
}