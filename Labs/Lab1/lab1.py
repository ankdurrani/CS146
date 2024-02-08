nums = [9,0,11,22]
target = 20
def target_sums(nums,target):
    num_map = {}
    for i, num in enumerate(nums):
        findNum = target - num
        if findNum in num_map:
            return [num_map[findNum],i]
        num_map[num] = i
    return 
print(target_sums(nums,target))
