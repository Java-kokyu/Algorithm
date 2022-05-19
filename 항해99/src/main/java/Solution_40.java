import java.util.Locale;

public class Solution_40 {
    public String solution(String new_id) {
        Level1 lv1 = new Level1();
        Level2 lv2 = new Level2();
        Level3_4 lv3_4 = new Level3_4();
        Level5 lv5 = new Level5();
        Level6 lv6 = new Level6();
        Level7 lv7 = new Level7();

        String answer = "";
        answer = lv1.toLowerCase(new_id);
        answer = lv2.removeChar(answer);
        answer = lv3_4.removeDot(answer);
        answer = lv5.isEmpty(answer);
        answer = lv6.lenCheck(answer);
        answer = lv7.addChar(answer);
        return answer;
    }
    class Level1{
        String toLowerCase(String s){
            s = s.toLowerCase(Locale.ROOT);
            return s;
        }
    }
    class Level2{
        String removeChar(String s){
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                //알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
                char ch = s.charAt(i);
                if(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' ||ch == '-' || ch == '_' || ch == '.')
                    str.append(s.charAt(i));
            }
            s = str.toString();
            return s;
        }
    }
    class Level3_4{
        String removeDot(String s){
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(i > 0 && s.charAt(i) == '.' && s.charAt(i-1) == '.') continue;
                str.append(s.charAt(i));
            }
            if(str.charAt(0) == '.') str.deleteCharAt(0);
            if(str.length() != 0 && str.charAt(str.length() - 1) == '.') str.deleteCharAt(str.length()-1);
            //StringIndexOutOfBoundsException
            s = str.toString();
            return s;
        }
    }
    class Level5{
        String isEmpty(String s){
            if(s.length() == 0) return "a";
            else return s;
        }
    }
    class Level6{
        String lenCheck(String s){
            StringBuilder str = new StringBuilder();
            str = (s.length() > 15) ? str.append(s.substring(0, 15)) : str.append(s);
            if(str.length() != 0 && str.charAt(str.length() - 1) == '.') str.deleteCharAt(str.length()-1);
            s = str.toString();
            return s;
        }
    }
    class Level7{
        String addChar(String s){
            if(s.length() == 1) return s += s + s;
            else if(s.length() == 2) return s += s.charAt(1);
            else return s;
        }
    }
}
