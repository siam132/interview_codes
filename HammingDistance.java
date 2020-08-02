class HammingDistance {

    public static void main(String[] args) {
        int n = 7;
        int k = 10;

        System.out.println(hammingDistance(n, k));

    }

    public static int hammingDistance(int x, int y) {
    

        return Integer.bitCount(x^y);
    }
}