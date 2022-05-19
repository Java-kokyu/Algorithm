public class Solution_27 {
    public int solution(int num) {
        long result = (long) num; //큰 수를 대입했을 때 오버플로우가 발생할 수 있으므로 long으로 형변환
        int count = 0;
        while (result != 1) {
            if (result % 2 == 0) {
                result = result / 2;
            } else {
                result = (result * 3) + 1;
            }
            count++;

            if (count == 500) {
                count = -1;
                break;
            }
        }

        return count;

        //1-1. 입력된 수가 짝수라면 2로 나눕니다.
        //1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
        //2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
        //3. 500번을 반복해도 1이 나오지 않는다면 -1 return
    }

    public int solution_2(int num) {
        long n = (long) num;
        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }
}
