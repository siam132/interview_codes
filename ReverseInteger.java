
class ReverseInteger {

    public static void main(String[] args) {
        int x = 1231123199;

        try {
            System.out.println(reverse(x));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static int reverse(int x) throws Exception {
        StringBuilder sb = new StringBuilder();
        if (x < 0) {
            sb.append("-");
            x *= -1;
        }

        while (x > 0) {
            int temp = x % 10;
            sb.append(temp);
            x = x / 10;
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (Exception e) {
            throw new Exception(e);
        }

    }

}