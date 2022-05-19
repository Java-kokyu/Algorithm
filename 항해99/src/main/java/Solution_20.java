import java.util.*;

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
    public String solution_2(String[] participant, String[] completion) {
        String answer = "";

        HashMap <String, Integer> map = new HashMap<>();
        for(String player : participant){
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for(String player : completion){
            map.put(player, map.get(player) - 1);
        }

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();


        while(iter.hasNext()){
            Map.Entry<String, Integer> entry  = iter.next();
            if(entry.getValue() == 1){
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}
