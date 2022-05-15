public class Solution_9 {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length();
        String end_num = phone_number.substring(num-4, num);
        for (int i = 0; i < (num-4); i++) answer += "*";
        answer += end_num;
        return answer;
    }
}
