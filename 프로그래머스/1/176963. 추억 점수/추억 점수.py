def solution(name, yearning, photo):
    answer = []
    for ph in photo:
        tmp = 0
        for ph_name in ph:
            if ph_name not in name:
                continue
            idx = name.index(ph_name)
            tmp += yearning[idx]
        answer.append(tmp)
    return answer