import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_26 {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};

        int[] answer;

        int min = 1000000;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        List<Integer> result_list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) continue;
            result_list.add(arr[i]);
        }
        answer = result_list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
    public int[] solution_2(int[] arr){
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Arrays.sort(arr);
        list.remove(list.indexOf(arr[0]));
        if (list.size() <= 0) return new int[]{-1};
        return list.stream().mapToInt(i->i).toArray();
    }
}
