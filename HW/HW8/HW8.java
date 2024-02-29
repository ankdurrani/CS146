import java.util.HashMap;
import java.util.Map;

public class HW8 {
    public int longestPalindrome(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        int length = 0;
        boolean hasOddFrequency = false;
        for (int count : frequencyMap.values()) {
            length += count / 2 * 2;
            if (count % 2 == 1) {
                hasOddFrequency = true;
            }
        }
            if (hasOddFrequency) {
            length++;
        }
        
        return length;
    }
}
