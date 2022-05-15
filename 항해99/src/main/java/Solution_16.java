import java.util.Locale;

public class Solution_16 {
    boolean solution(String s) {
        int count_p = 0;
        int count_y = 0;
        String str = s.toLowerCase(Locale.ROOT);
        for(int i = 0; i < s.length(); i++){
            if(str.charAt(i)=='p') count_p++;
            else if(str.charAt(i)=='y') count_y++;
        }
        System.out.printf("%d %d",count_p, count_y);
        return (count_p == count_y);
    }
    // return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
}
