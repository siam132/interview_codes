class ReverseInt {

    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt();

        System.out.println(reverseInt.reverse(-234));
        System.out.println(reverseInt.reverse(Integer.MAX_VALUE));

    }

    public int reverse(int x) {

        StringBuilder sb = new StringBuilder();
        if (x < 0) {
            sb.append("-");
            x = x * -1;
        }

        while (x > 9) {
            int curr = x % 10;
            x = x / 10;
            sb.append(curr);
        }
        sb.append(x);

        int retVal;

        try {
            retVal = Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }

        return retVal;
    }
}