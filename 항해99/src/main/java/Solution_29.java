import java.util.ArrayList;
import java.util.List;

public class Solution_29 {
    public long solution(int n) {
        long answer = 0;
        int temp = n;
        int ternary = 0;
        List<Integer> ternary_list = new ArrayList<>();
        while(temp != 0) {
            ternary = temp % 3;
            temp /= 3;
            ternary_list.add(ternary);
        }
        int list_size = ternary_list.size();
        for(int i = 0; i < list_size; i++){
            answer += (long)Math.pow(3, i) * ternary_list.get(list_size -i -1);
        }
       return answer;
    }
    public long solution_2(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);
        //parseInt의 두 번째 매개변수는 n진법으로 변환한다는 의미. Integer.parserInt(n, 8)은 String n을 8진법으로 변환한다는 의미
    }
}
