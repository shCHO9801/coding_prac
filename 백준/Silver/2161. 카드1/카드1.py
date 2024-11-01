import sys
from collections import deque
N = int(sys.stdin.readline())
d = deque([])
answer = []

#숫자카드
for i in range(N):
    d.append(i+1)

while len(d) != 1:
    answer.append(d.popleft())
    d.append(d.popleft())

answer.append(d.popleft())
for i in answer:
    print(i, end=' ')