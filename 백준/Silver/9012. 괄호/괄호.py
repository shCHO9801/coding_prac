import sys

def f(s):
    count = 0
    for i in s:
        if i == '(':
            count+=1
        elif i == ')':
            if count > 0:
                count -= 1
            else :
                return False

    if count == 0:
        return True
    else :
        return False
    

n = int(sys.stdin.readline())

for _ in range(n):
    stack = []
    n = (sys.stdin.readline())
    print("YES" if f(n) else "NO")
    