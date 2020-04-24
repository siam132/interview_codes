import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String str = "(";

        System.out.println(isValid(str));

    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (st.isEmpty())
                    return false;
                if (!helper(s.charAt(i), st.pop()))
                    return false;
                else
                    continue;
            }
        }

        if (!st.isEmpty())
            return false;

        return true;

    }

    public static boolean helper(char a, char b) {

        if (b == '(' && a == ')')
            return true;
        else if (b == '{' && a == '}')
            return true;
        else if (b == '[' && a == ']')
            return true;

        else
            return false;

    }

}