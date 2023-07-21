def solution(n):
    answer = 0
    i = 0
    while answer < n:
        i += 1
        if i % 3 != 0 and "3" not in str(i):
            answer += 1
    return i