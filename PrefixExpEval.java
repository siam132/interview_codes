import java.util.Stack;

class PrefixExpEval {
    public static void main(String[] args) {

        String s = "*-123";

        System.out.println(ExpEval(s));

    }

    public static int ExpEval(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isDigit(s.charAt(i))) {
                st.push(Character.getNumericValue(s.charAt(i)));
            } else {

                int x = st.pop();
                int y = st.pop();
                char op = s.charAt(i);
                st.push(ApplyOp(x, y, op));
            }
        }
        return st.peek();
    }

    public static int ApplyOp(int x, int y, char op) {
        switch (op) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                return 0;
        }

    }
}