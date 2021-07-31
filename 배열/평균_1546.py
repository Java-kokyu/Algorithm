import sys

N = int(input())
scores = list(map(int, sys.stdin.readline().split()))

scores = scores[:N]
M = max(scores)

fake_avg = (sum(scores) / M*100) / N
print(fake_avg)
