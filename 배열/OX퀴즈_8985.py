import sys

T = int(input())
sum_list = []

for i in range(T):
    quiz = sys.stdin.readline();
    OX_result = []
    O = ''
    sum = 0

    for i in range(len(quiz)):
        if quiz[i] == 'O':
            O = O + 'O'
        elif O != '':
            OX_result.append(O)
            O = ''

    for i in range(len(OX_result)):
        n = len(OX_result[i])
        result = n * (n+1) // 2
        sum += result

    sum_list.append(sum)

for i in range(len(sum_list)):
    print(sum_list[i])

