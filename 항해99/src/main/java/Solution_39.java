public class Solution_39 {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                answer += ' ';
            }else if(ch >= 'A' && ch <= 'Z' && ch + n <= 'Z'){
                answer = answer + (char)(ch + n);
            }else if(ch < 'a' && ch + n > 'Z'){
                answer = answer + (char)(ch + n - 26);
            }else if(ch >= 'a' && ch <= 'z' && ch + n <= 'z'){
                answer = answer + (char)(ch + n);
            }else if(ch + n > 'z'){
                answer = answer + (char)(ch + n - 26);
            }
        }
        return answer;
    }
}
