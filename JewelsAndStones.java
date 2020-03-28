import java.util.*;

class JewelsAndStones {

    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones(); 

        System.out.println(jewelsAndStones.numJewelsInStones("AaS", "AA"));
        System.out.println(jewelsAndStones.numJewelsInStones("AaS", "MNC"));

    }

    public int numJewelsInStones(String J, String S) {
        HashSet <Character> hs = new HashSet<Character>(); 

        for(char x: J.toCharArray()){
            hs.add(x); 
        }
        int count = 0; 

        for(int i = 0; i < S.length(); i++){
            if(hs.contains(S.charAt(i))){
            count++; 
            }
            else;
           
        }

        return count;

    }

}

/*You're given strings J representing the types of stones
 that are jewels, and S representing the stones you have. 
 Each character in S is a type of stone you have.  You want 
 to know how many of the stones you have are also jewels.
 
 
 Input: J = "aA", S = "aAAbbbb"
 Output: 3
 
 1) insert J into a hashset since J is guranteed to be unique 
 2) init  count
 3) for ( i 0 to S.len)
    if s.charat i is in J increment count
    return count 
 
 */