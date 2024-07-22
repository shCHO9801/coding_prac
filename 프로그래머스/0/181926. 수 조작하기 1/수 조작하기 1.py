def solution(n, control):
    answer = n
    sum_value = [1,-1,10,-10]
    count = [0,0,0,0]
    for i in control:
        if i == 'w':
            count[0]+=1
        if i == 's':
            count[1]+=1
        if i == 'd':
            count[2]+=1
        if i == 'a':
            count[3]+=1
    for i in range(len(count)):
        answer += count[i] * sum_value[i]
            
    return answer