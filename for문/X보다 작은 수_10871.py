import sys
N, X = map(int, input().split())
num_list = []

if N >= 1 and X <= 10000:
    num_list = list(map(int, sys.stdin.readline().split()))
    num_list = num_list[:N]
    result_list = []
    for i in range(len(num_list)):
        if num_list[i] < X:
            result_list.append(num_list[i])
    print(' '.join(map(str, result_list)))
