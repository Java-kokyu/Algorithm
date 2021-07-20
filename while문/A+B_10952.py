import sys

C_list = []

while True:    
    A, B = map(int, sys.stdin.readline().split())
    if A == 0 and B == 0:
        break
    elif A > 0 and B < 10:
        C = A + B
        C_list.append(C)
    else:
        print("please put num1 > 0 and num2 < 10. if you want to get out of loop, put 0 0.")
for i in range(len(C_list)):
    print(C_list[i])
