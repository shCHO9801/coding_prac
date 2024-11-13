import sys

n = sorted(list(map(int, sys.stdin.readline().split())))

if n[0] == n[1] == n[2]:
    print(10000+1000*n[2])
elif n[0] == n[1] or n[1] == n[2]:
    print(1000 + n[1] * 100)
else :
    print(100 * n[2])