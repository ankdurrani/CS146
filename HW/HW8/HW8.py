from collections import Counter

class Solution:
    def longestPalindrome(self, s: str) -> int:
        frequency_map = Counter(s)
        length = 0
        has_odd_frequency = False
        
        for count in frequency_map.values():
            length += count // 2 * 2
            if count % 2 == 1:
                has_odd_frequency = True
        
        if has_odd_frequency:
            length += 1
        
        return length
