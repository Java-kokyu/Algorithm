import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_36 {
    public String solution(String s) {
        String answer = "";
        int str_len = s.length();
        List<Character> low_str = new ArrayList<>();
        List<Character> upper_str = new ArrayList<>();

        for (int i = 0; i < str_len; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                low_str.add(s.charAt(i));
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                upper_str.add(s.charAt(i));
            }
        }

        Collections.sort(low_str, Collections.reverseOrder());
        Collections.sort(upper_str, Collections.reverseOrder());
        for (int i = 0; i < low_str.size(); i++) {
            answer += low_str.get(i);
        }
        for (int i = 0; i < upper_str.size(); i++) {
            answer += upper_str.get(i);
        }
        return answer;
    }

    public String solution_2(String s) {
        char[] sol = s.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
