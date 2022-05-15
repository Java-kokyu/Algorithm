public class Solution_11 {
    public long[] solution(int x, int n) {
        long X = x;
        long [] answer = new long[n];
        for(int i = 1; i <= n; i++){
            answer[i - 1] = X * i;
        }
        return answer;
    }
}
