N = int(input())

if not N > 0 and N <= 100:
    print("please put over 0 and 100 or less integer number.")
else:
    for i in range(1, N+1):
        print(' ' * (N-i) + '*' * i)