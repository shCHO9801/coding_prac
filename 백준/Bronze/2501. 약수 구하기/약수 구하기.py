import sys

list_divisor = []

p, q = map(int, sys.stdin.readline().split())

for i in range(1, p+1):
    if p % i == 0:
        list_divisor.append(i)

print(list_divisor[q-1] if len(list_divisor) >= q else 0)