import sys

def num_condition(num):
    return num > -1000000 and num < 1000000

N = int(input())
ary = list(map(int, sys.stdin.readline().split()))
ary = list(filter(num_condition, ary))

if (N >= 0 and 1000000):
    ary = ary[:N]
    MAX = max(ary)
    MIN = min(ary)
    print(MIN, MAX)

