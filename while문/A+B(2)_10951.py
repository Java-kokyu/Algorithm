import sys

while True: 
    try:   
        A, B = map(int, sys.stdin.readline().split())
        if not A > 0 and B < 10:
            print("please put num1 > 0 and num2 < 10.")
        else:
            C = A + B
            print(C)
    except:
        break
