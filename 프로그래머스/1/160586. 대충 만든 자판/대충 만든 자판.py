def solution(keymap, targets):
    answer = []
    
    tmp = "ABCDEFGHIJKLMNOPQRSTUVWYXZ"
    alpha = [i for i in tmp]
    val = [1000 for i in range(len(tmp))]
    dictKeys = dict(zip(alpha, val))
    
    for key in keymap:
        listS = list(key)
        for idx in range(len(listS)):
            idxVal = idx + 1
            s = listS[idx]
            dictKeys[s] = min(dictKeys[s], idxVal)
            
    for target in targets:
        result = 0
        for s in target:
            if dictKeys[s] == 1000:
                result = -1
                break
            result += dictKeys[s]
        answer.append(result)
        
    return answer