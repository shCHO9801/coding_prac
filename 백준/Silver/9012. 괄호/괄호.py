import sys

def f(s):
    stack = []
    for i in s:
        if i == '(':
            stack.append(i)
        elif i == ')':
            if not stack:
                return False
            if stack[-1] != '(':
                return False
            else:
                stack.pop()

    if stack:
        return False
    else :
        return True
    

n = int(sys.stdin.readline())

for _ in range(n):
    stack = []
    n = (sys.stdin.readline())
    print("YES" if f(n) else "NO")
    