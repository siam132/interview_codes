import java.util.Arrays;

class IncreasingDecreasingString {

    /*
     * Given a string s. You should re-order the string using the following
     * algorithm:
     * 
     * 1 Pick the smallest character from s and append it to the result. 
     * 2 Pick the smallest character from s which is greater than the last appended character
     * to the result and append it. 
     * 3 Repeat step 2 until you cannot pick more characters. 
     * 4 Pick the largest character from s and append it to the result.
     * 5 Pick the largest character from s which is smaller than the last appended
     * character to the result and append it. 
     * 6 Repeat step 5 until you cannot pick more characters. 
     * 7 Repeat the steps from 1 to 6 until you pick all characters
     * from s. In each step, If the smallest or the largest character appears more
     * than once you can choose any occurrence and append it to the result.
     * 
     * Return the result string after sorting s with this algorithm.
     */

    public static void main(String[] args) {
        String s = increasingDecreasingString("vrwhhkaydscvllvcsdyakhhwrv");
        System.out.println(s);
    }

    public static String increasingDecreasingString(String s) {
        // Declaring the result String
        StringBuilder result = new StringBuilder("");

        // taking counter letterCount for iterating over the loop
        int letterCount = s.length();

        // Counting the frequency of the letters using array;
        int letterFrequency[] = new int[26];
        Arrays.fill(letterFrequency, 0);
        for (int i = 0; i < s.length(); i++) {
            letterFrequency[s.charAt(i) - 'a']++;
        }

        // iterating the loop for numberOfLetters present in the String
        while (letterCount > 0) {

            // iterating for the steps 1-2-3 i.e taking the string for the last
            for (int i = 0; i < letterFrequency.length; i++) {

                if (letterFrequency[i] != 0) {
                    result.append((char) (i + 97));
                    letterFrequency[i]--;
                    letterCount--;
                }
            }

            // iterating for the step 4-5-6 i.e taking the string from the last
            for (int i = letterFrequency.length - 1; i >= 0; i--) {
                if (letterFrequency[i] != 0) {
                    result.append((char) (i + 97));
                    letterFrequency[i]--;
                    letterCount--;
                }
            }
        }

        // converting the StringBuilder to String Using toString() function
        return result.toString();

    }
}