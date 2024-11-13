import sys

h, m = map(int, sys.stdin.readline().split())
add = int(sys.stdin.readline())

m += add

if m >= 60:
    h +=(int)(m / 60)
    m = m % 60
if h >= 24:
    h = int(h % 24)
    
print(h,m)