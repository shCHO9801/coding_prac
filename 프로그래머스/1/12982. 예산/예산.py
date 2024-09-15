# greedy 사용

def solution(d, budget):
    answer = 0
    total = 0
    
    d.sort()
    for i in range(0, len(d)):
        if total + d[i] > budget:
            break
        total += d[i]
        answer += 1
        
    return answer