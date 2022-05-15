public class Solution_8 {
    public double solution(int[] arr) {
        long sum = 0;
        int lenAry = arr.length;
        for(int i = 0; i < lenAry; i++){
            sum += arr[i];
        }
        double answer = (double) sum / lenAry;
        return answer;
    }
}
