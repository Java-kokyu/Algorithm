import java.util.ArrayList;
import java.util.List;

public class Solution_23 {
    public int[] solution(long n) {
        List<Integer> num_list = new ArrayList<>();
        long temp = n;
        int num = 0;
        for(int i = 0; temp != 0; i++){
            num = (int)(temp % 10);
            temp /= 10;
            num_list.add(num);
        }
        int[] answer = num_list.stream().mapToInt(i -> i).toArray();
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
        return answer;
    }
}
