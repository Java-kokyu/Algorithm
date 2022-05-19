public class Solution_38 {
    class StrNumber {
        public int numReturn(String s){
            String[] num_str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            switch (s){
                case "ze": return 0;
                case "on": return 1;
                case "tw": return 2;
                case "th": return 3;
                case "fo": return 4;
                case "fi": return 5;
                case "si": return 6;
                case "se": return 7;
                case "ei": return 8;
                case "ni": return 9;
                default: return 0;
            }
        }
    }
    public long solution(String s) {
        long answer = 0;
        String str = "";
        String str_disc = "";
        String[] num_str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        StrNumber strNumber = new StrNumber();
        int i = 0;
        while (i < s.length()){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') { // 0부터 9까지인데 1부터 9까지라고 실수함
                str += s.charAt(i);
                i++;
            }else{
                str_disc = s.substring(i, i+2);
                str += strNumber.numReturn(str_disc);
                i = i + num_str[strNumber.numReturn(str_disc)].length();
            }
        }
        answer = Long.parseLong(str);
        return answer;
    }

    public int solution_2(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
}

