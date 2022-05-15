public class Solution_7 {
    public int solution(int[] absolutes, boolean[] signs) {
        int result = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                result += absolutes[i];
            } else {
                result -= absolutes[i];
            }
        }
        return result;
    }
}
