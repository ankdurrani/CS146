def firstBadVersion(n):
    left, right = 1, n
    while left < right:
        middle = left + (right-left) // 2
        if isBadVersion(middle):
            right = middle
        else:
            left = middle + 1
    return left

def isBadVersion(version):
   return 

    n = 10
    print(firstBadVersion(n))
