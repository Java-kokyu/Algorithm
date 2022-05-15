public class Solution_13 {

    public String solution(int a, int b) {
        Count_Day d = new Count_Day();
        int result_num = d.count_day(a, b) % 7;
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        String answer = days[result_num];
        return answer;
    }

    // int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    class Count_Day {
        public int count_day(int a, int b) {
            int day = 0;
            switch (a) {
                case 1:
                    day = b;
                    break;
                case 2:
                    day = 31 + b;
                    break;
                case 3:
                    day = 31 + 29 + b;
                    break;
                case 4:
                    day = 31 * 2 + 29 + b;
                    break;
                case 5:
                    day = 30 + 31 * 2 + 29 + b;
                    break;
                case 6:
                    day = 30 + 31 * 3 + 29 + b;
                    break;
                case 7:
                    day = 30 * 2 + 31 * 3 + 29 + b;
                    break;
                case 8:
                    day = 30 * 2 + 31 * 4 + 29 + b;
                    break;
                case 9:
                    day = 30 * 2 + 31 * 5 + 29 + b;
                    break;
                case 10:
                    day = 30 * 3 + 31 * 5 + 29 + b;
                    break;
                case 11:
                    day = 30 * 3 + 31 * 6 + 29 + b;
                    break;
                case 12:
                    day = 30 * 4 + 31 * 6 + 29 + b;
                    break;
            }
            return day;
        }
    }
}
