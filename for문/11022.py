import sys

T = int(input())
result_list = []

for i in range(T):
    num_list = []
    A, B = map(int, sys.stdin.readline().split())
    C = A + B
    if A > 0 and B < 10:
        num_list = [A, B, C]
        result_list.append(num_list)
    else:
        print("The condition of input numbers is num1 > 0 and num2 < 10")

for i in range(len(result_list)):
    print("Case #%d: %d + %d = %d" %(i+1, result_list[i][0], result_list[i][1], result_list[i][2]))





