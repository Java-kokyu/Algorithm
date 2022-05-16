public class Solution_21 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ", -1);
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("") && i != str.length-1){
                answer += " ";
                continue;
            }
            for (int j = 0; j < str[i].length(); j++) {
                answer += (j % 2 == 0) ? str[i].toUpperCase().charAt(j) : str[i].toLowerCase().charAt(j);
            }
            if(i != str.length - 1) answer += " ";
        }
        System.out.println(answer);


        return answer;
    }
    public String solution_2(String s) {
        String answer = "";
        char[] char_list = s.toCharArray();
        for(int i = 0; i < char_list.length; i++){
            if(char_list[i]  == ' '){

            }
        }

        return answer;

    }
}
