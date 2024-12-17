import sys

while True:
    list = []
    sum = 0
    p = int(sys.stdin.readline())
    if p == -1:
        break

    for i in range(1, p):
        if(p % i == 0):
            list.append(i)
            sum += i

    if(sum == p):
        print(p, ' = ', sep='', end='')
        for i in range(len(list)):
            print(list[i], end='')
            if(i < len(list) - 1) :
                print(' + ', end='')
    else:
        print(p, "is NOT perfect.", end='')
    print()