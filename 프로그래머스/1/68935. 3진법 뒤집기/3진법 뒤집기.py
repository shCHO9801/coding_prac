def makeBin(a):
    result = ""
    while(a != 0) :
        result += str(a % 3)
        a //= 3
    return result

def solution(n):
    answer = 0
    bin3 = makeBin(n)
    rev = [ord(i) - ord('0') for i in bin3]
    rev.reverse()
    
    mul = 1
    for i in rev:
        answer += mul * i
        mul *= 3
        
    return answer