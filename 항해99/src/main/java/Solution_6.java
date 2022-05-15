public class Solution_6 {
    public int solution(int[] numbers) {
        int result = 45;
        for(int i = 0; i < numbers.length; i++){
            result -= numbers[i];
        }
        return result;
    }

}
