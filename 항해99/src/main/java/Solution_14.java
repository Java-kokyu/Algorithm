import java.util.ArrayList;
import java.util.List;

public class Solution_14 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> temp = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                temp.add(arr[i]);
            }
        }
        int[] answer = temp.stream().mapToInt(i -> i).sorted().toArray();
        if (answer.length == 0)
            answer = new int[]{-1};
        return answer;

        //Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray()

    }
}
