import sys
m = 0

while True:

    n = sys.stdin.readline().strip()
    if n == "고무오리 디버깅 끝":
        break
    elif n == "문제":
        m+=1
    elif n == "고무오리":
        if m == 0 :
            m += 2
        else :
            m -= 1

if m == 0 :
    print("고무오리야 사랑해")
else :
    print("힝구")