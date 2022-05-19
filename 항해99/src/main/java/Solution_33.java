import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_33 {
    public int[] solution(int[] lottos, int[] win_nums) {
        //lottos 0이 포함된 로또 번호 순서 상관 없음.
        //max = lottos == win_nums의 개수 + 0의 개수
        //min = lottos == win_nums의 개수

        List<Integer> num_list = new ArrayList<>(Arrays.stream(lottos).boxed().collect(Collectors.toList()));
        num_list.removeAll(Collections.singleton(0));
        //removeAll 함수보다 for문으로 0의 개수를 찾는 게 더 효율적
        int removed_num = 6 - num_list.size();
        int count = 0;
        int max_rank = 0;
        int min_rank = 0;

        for (int i = 0; i < win_nums.length; i++) {
            count += num_list.contains(win_nums[i]) ? 1 : 0;
        }

        min_rank = (count < 2) ? 6 : 7 - count;
        max_rank = (removed_num + count < 2) ? 6 : 7 - removed_num - count;
        // 함수를 만들었어도 좋았을 듯


        return new int[]{max_rank, min_rank};

    }
}
