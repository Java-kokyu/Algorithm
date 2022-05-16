public class Solution_28 {
    public boolean solution(int x) {
        boolean answer = true;
        int harshad = 0;
        int temp = x;
        while(temp != 0){
            harshad += temp % 10;
            temp /= 10;
        }
        return (x % harshad == 0)? true : false;
    }

}
