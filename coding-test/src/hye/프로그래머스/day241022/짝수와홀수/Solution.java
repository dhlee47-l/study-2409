package hye.프로그래머스.day241022.짝수와홀수;

public class Solution {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}
