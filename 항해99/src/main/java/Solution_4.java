public class Solution_4 {
    public long solution(int a, int b) {
        long A = a;
        long B = b;
        long answer = (A < B)? ((A+B) * (B-A+1) / 2) : ((A+B) * (A-B+1) / 2);
        return answer;
    }

}
