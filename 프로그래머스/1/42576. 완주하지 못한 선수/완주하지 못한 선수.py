from collections import Counter

def solution(participant, completion):
    # dic = Counter(participant)
    
    dic = {}
    for p in participant:
        if p not in dic:
            dic[p] = 1
        else :
            dic[p] += 1
        
    for c in completion:
        dic[c] -= 1
    
    for key in dic.keys():
        if dic[key] > 0:
            return key
        
    return ""