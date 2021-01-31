import java.security.InvalidParameterException;
import java.util.*;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible
 * letter combinations that the number could represent. Return the answer in any
 * order.
 * 
 * A mapping of digit to letters (just like on the telephone buttons) is given
 * below. Note that 1 does not map to any letters.
 * 
 * Input: digits = "23"
 * 
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * 
 */

public class phoneLetterCombo {

    public static void main(String[] args) {

        ArrayList<char[]> input = new ArrayList<char[]>();
        ArrayList<String> output = new ArrayList<String>();
        String s = "24";

        if (!s.matches("[2-9]*")) {
            throw new InvalidParameterException("Only digits from 1 to 9 is valid");
        }

        populate(s, input);
        combine(input, new char[input.size()], output, 0);
        System.out.println(output.toString());
    }

    public static void populate(String s, ArrayList<char[]> arr) {
        if (s.length() == 0)
            return;
        HashMap<Character, char[]> hm = new HashMap<Character, char[]>();
        hm.put('2', new char[] { 'a', 'b', 'c' });
        hm.put('3', new char[] { 'd', 'e', 'f' });
        hm.put('4', new char[] { 'g', 'h', 'i' });
        hm.put('5', new char[] { 'j', 'k', 'l' });
        hm.put('6', new char[] { 'm', 'n', 'o' });
        hm.put('7', new char[] { 'p', 'q', 'r', 's' });
        hm.put('8', new char[] { 't', 'u', 'v' });
        hm.put('9', new char[] { 'w', 'x', 'y', 'z' });

        for (char c : s.toCharArray()) {
            try {
                arr.add(hm.get(c));
            } catch (Exception e) {
                System.err.println("Invalid input" + e);
            }

        }

    }

    public static void combine(ArrayList<char[]> input, char[] current, ArrayList<String> output, int k) {
        if (k == input.size()) {
            String temp = "";
            for (int i = 0; i < k; i++) {
                temp += current[i];
            }
            output.add(temp);
        } else {
            for (int j = 0; j < input.get(k).length; j++) {
                current[k] = input.get(k)[j];
                combine(input, current, output, k + 1);
            }
        }

    }

}
