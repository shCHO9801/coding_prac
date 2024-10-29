import sys

n = int(sys.stdin.readline())
stack = []

for _ in range(n):
    com = sys.stdin.readline().split()
    c = int(com[0])
    if(c == 1):
        stack.append(int(com[1]))
    elif c == 2:
        if stack:
            print(stack.pop())
        else :
            print(-1)
    elif c == 3:
        print(len(stack))
    elif c == 4:
        print(0 if stack else 1)
    else:
        print(stack[-1] if stack else -1)