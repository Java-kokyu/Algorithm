public class Solution_12 {
    public long solution(int price, long money, int count) {
        long pay = ((long)price * count * (count + 1) / 2);

        return (money >= pay)? 0 : pay - money;
    }
}
// 범위에 따라 int를 줄건지 long을 줄건지, float를 줄건지 double을 줄건지 생각해야함.
