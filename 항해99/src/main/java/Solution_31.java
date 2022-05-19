import java.util.*;

public class Solution_31 {
        public int[] solution(int []arr) {
        int[] answer = {};
        List <Integer> int_list = new ArrayList<>();

        if(arr.length == 1) return arr;
        int j = 0;

        for(int i = 0; i < arr.length; i++){
            int_list.add(arr[i]);
            if(j != 0 && int_list.get(j) == int_list.get(j-1)){
                int_list.remove(j);
                continue;
            }
            j++;
        }

        answer = int_list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
