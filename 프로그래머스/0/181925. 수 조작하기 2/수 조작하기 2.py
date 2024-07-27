def solution(numLog):
    answer = ''
    for i in range(len(numLog)-1):
        val = numLog[i+1] - numLog[i]
        if val == 1:
            answer+='w'
        if val == -1:
            answer+='s'
        if val == 10:
            answer+='d'
        if val == -10:
            answer+='a'
    return answer