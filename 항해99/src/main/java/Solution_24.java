import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_24 {
    public long solution(long n) {
        long answer = 0;
        int num = 0;
        long share = n;
        List<Integer> num_list = new ArrayList<>();

        for (int i = 0; share != 0 ; i++) {
            num = (int) share % 10;
            share = share / 10;
            num_list.add(num);
        }
        Collections.sort(num_list);
        answer = num_list.get(0);
        for (int j = 1; j < num_list.size(); j++) {
            long digit = (long)Math.pow(10, j);
            answer += (long)num_list.get(j) * digit;
        }
        return answer;
    }
}
