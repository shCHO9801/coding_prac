from collections import deque
dq = deque([])

import sys
n, k = map(int, sys.stdin.readline().split())

dq = deque((range(1, n+1)))
answer = []


while len(dq) != 0:
    for i in range(k - 1) :
        dq.append(dq.popleft())
    answer.append(dq.popleft())

print('<', end='')
for i in range(len(answer)):
    print(answer[i], end='')
    if(i != len(answer) - 1) :
        print(', ', end='')
print('>')