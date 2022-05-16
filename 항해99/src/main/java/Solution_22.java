import java.util.*;

public class Solution_22 {
    public int solution(int n) {
        int answer = 0;
        int temp = n;

        for(int i = 0; temp != 0; i++){
            answer += temp % 10;
            temp /= 10;
        }

        return answer;
    }
}