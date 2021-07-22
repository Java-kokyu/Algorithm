import sys

C = int(input())
result_list = []

for i in range(C):
    try: 
        num_scores = list(map(int, sys.stdin.readline().split()))
        if(num_scores[0] < 1 and num_scores > 1000):
            print("please put 1 or more and 1000 or less number")
            break
        student_num = num_scores[0]
        student_score = [x for x in num_scores[1: student_num+1] if x >= 0 and x <= 100]
        score_avg = sum(student_score) / len(student_score)
        over_avg_student = [x for x in student_score if x > score_avg]
        result = len(over_avg_student) / student_num * 100
        result_list.append(round(result, 3))
        print(f'{result_list[i]:.3f}%')
    except:
        print("The input style should be student number score1 score2 score3 ...")

    




