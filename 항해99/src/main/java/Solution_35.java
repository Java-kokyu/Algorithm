import java.util.*;

public class Solution_35 {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> str_list = new ArrayList<>();
        for(int i = 0; i < strings.length; i++){
            char ch = strings[i].charAt(n);
            str_list.add(ch + strings[i]);
        }
        Collections.sort(str_list);
        for(int i = 0; i < str_list.size(); i++){
           answer[i] = str_list.get(i).substring(1, str_list.get(i).length());
        }

        return answer;
    }
}
