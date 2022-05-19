import java.util.*;
import java.util.stream.Collectors;

public class Solution_32 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> result = new HashSet<>();

        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                sum = numbers[i] + numbers[j];
                result.add(sum);
            }
        }

        answer = result.stream().sorted().mapToInt(i -> i).toArray();
        return answer;
    }
}
