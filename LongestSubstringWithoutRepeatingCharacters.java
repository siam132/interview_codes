import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    // Input: s = "abcabcbb"
    // Output: 3
    // Explanation: The answer is "abc", with the length of 3.
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<Character>();
        int max_so_far = 0; 
        int right = 0, left = 0; 

        while(right < s.length() ) {
            if(hs.add(s.charAt(right))){
            max_so_far = max_so_far < hs.size()? hs.size(): max_so_far; 
            }else{
                hs.clear();
                left++; 
                right = left; 
                continue;
            }
            right++; 
             
        }
        return max_so_far; 
    }

}
