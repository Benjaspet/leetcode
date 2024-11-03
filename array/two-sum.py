class Solution(object):
    
    def twoSum(self, nums, target):
        
        map = {}

        for i, n in enumerate(nums):
            difference = target - n
            if difference in map:
                return [map[difference], i]
            map[n] = i

        return None