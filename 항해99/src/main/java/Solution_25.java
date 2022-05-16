public class Solution_25 {
    public long solution(long n) {
        long answer = 0;
        double result = Math.sqrt(n);
        int result_int = (int) result;
        double result_deci = result - result_int;
        if (result_deci == 0.0) {
            answer = (long) Math.pow(result + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
    public long solution_2(long n){
        double i = Math.sqrt(n);
        return Math.floor(i) == i ? (long) Math.pow(i + 1, 2) : -1;
    }
}
