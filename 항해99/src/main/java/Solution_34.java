import java.util.ArrayList;
import java.util.List;

public class Solution_34 {
    //테스트 케이스 9 10 12 13 오류
    public int[] solution(int[] answers) {

        int total_question = answers.length;

        Solution_34 p = new Solution_34();

        int[] student_1 = new int[total_question];
        int[] student_2 = new int[total_question];
        int[] student_3 = new int[total_question];

        for (int i = 0; i < total_question; i++) {
            student_1[i] = (i + 1) % 5;
            student_2[i] = (i % 2) == 0 ? 2 : p.pattern_2(i);
            student_3[i] = p.pattern_3(i);

        }


        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < total_question; i++) {
            count1 += (student_1[i] == answers[i]) ? 1 : 0;
            count2 += (student_2[i] == answers[i]) ? 1 : 0;
            count3 += (student_3[i] == answers[i]) ? 1 : 0;
        }

        int max_value = p.max(count1, count2, count3);

        List<Integer> students = new ArrayList<>();

        if (count1 == max_value) students.add(1);
        if (count2 == max_value) students.add(2);
        if (count3 == max_value) students.add(3);

        int[] answer = students.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    int pattern_2(int num) {
        switch (((num + 1) / 2) % 4) {
            case 0:
                return 5;
            case 1:
                return 1;
            case 2:
                return 3;
            case 3:
                return 4;
            default:
                return 0;
        }
    }

    int pattern_3(int num) {
        switch ((num / 2) % 5) {
            case 0:
                return 3;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            default:
                return 0;
        }
    }

    int max(int a, int b, int c) {
        int max = a;
        max = (b > max) ? b : max;
        max = (c > max) ? c : max;
        return max;
    }

    public int[] solution_2(int[] answers) {
        int[] student_1 = {1, 2, 3, 4, 5};
        int[] student_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> answer_1 = new ArrayList<>();
        List<Integer> answer_2 = new ArrayList<>();
        List<Integer> answer_3 = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            answer_1.add(student_1[i % student_1.length]);
            answer_2.add(student_2[i % student_2.length]);
            answer_3.add(student_3[i % student_3.length]);
        }

        int count_1 = 0;
        int count_2 = 0;
        int count_3 = 0;
        int max_count = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == answer_1.get(i)) count_1++;
            if (answers[i] == answer_2.get(i)) count_2++;
            if (answers[i] == answer_3.get(i)) count_3++;
        }

        max_count = Math.max(count_1, Math.max(count_2, count_3));

        List<Integer> students = new ArrayList<>();


        if (max_count == count_1) students.add(1);
        if (max_count == count_2) students.add(2);
        if (max_count == count_3) students.add(3);

        int[] answer = students.stream().mapToInt(i -> i).toArray();


        return answer;
    }

}






