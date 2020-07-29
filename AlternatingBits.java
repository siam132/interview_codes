class AlternatingBits {
    public static void main(String[] args) {

        System.out.println(hasAlternatingBits(11));

    }

    public static boolean hasAlternatingBits(int num) {
        String str = Integer.toBinaryString(num);

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                return false;
        }

        return true;
    }
}