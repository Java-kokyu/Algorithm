public class Solution_3 {
    public String solution(String s) {
        String answer = "";
        int index = s.length() / 2;
        if (s.length() % 2 == 1){
            char temp = s.charAt(index);
            answer = String.valueOf(temp);
        }else {
            answer += s.charAt(index-1);
            answer += s.charAt(index);
        }
        return answer;
    }
}
