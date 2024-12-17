import sys

list_divisor = [0]

n, k = map(int, sys.stdin.readline().split())

for i in range(1, n + 1):
    if n % i == 0:
        list_divisor.append(i)

print(list_divisor[k] if len(list_divisor) > k else 0)