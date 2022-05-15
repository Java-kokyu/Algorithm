import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_20 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> ary_p = new ArrayList<>(Arrays.asList(participant));
        for(int i = 0; i < completion.length; i++) {
            int index = ary_p.indexOf(completion[i]);
            ary_p.remove(index);
        }
        answer = ary_p.get(0);
        System.out.println(answer);
        return answer;
    }
}
