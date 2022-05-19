import java.util.ArrayList;
import java.util.List;

public class Solution_23 {
    public int[] solution(long n) {
        List<Integer> num_list = new ArrayList<>();
        long temp = n;
        int num = 0;
        for (int i = 0; temp != 0; i++) {
            num = (int) (temp % 10);
            temp /= 10;
            num_list.add(num);
        }
        int[] answer = num_list.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }

    public int[] solution_2(long n) {
        int[] answer;

        // declare Array length
        String tempStr = String.valueOf(n);
        answer = new int[tempStr.length()];

        // long n to int Array
        for (int i = 0; i < tempStr.length(); i++) {
            String tempChar = tempStr.charAt(i) + "";
            int tempInt = Integer.parseInt(tempChar);
            answer[i] = tempInt;
        }

        // 정렬 - 올림차순
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if (answer[i] >= answer[j]) {
                    int tempInt = answer[i];
                    answer[i] = answer[j];
                    answer[j] = tempInt;
                }
            }
        }
        return answer;
    }
}
