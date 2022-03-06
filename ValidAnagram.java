import java.util.HashMap;

public class ValidAnagram {
/* Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word 
or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
*/
    public static void main(String[] args) {
        String s = "cat", t = "rat"; 
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c: s.toCharArray()){
            if(!hm.containsKey(c))
                hm.put(c, 1); 
            else{
                int cnt = hm.get(c); 
                hm.put(c, cnt+1); 
            }
        }
        for(char c: t.toCharArray()){
            if(!hm.containsKey(c) || hm.get(c) == 0){
                return false; 
            }else{
                int cnt = hm.get(c); 
                hm.put(c, cnt-1); 
            }
        }
        return s.length()!=t.length()? false: true; 
    }
}
