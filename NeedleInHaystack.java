
public class NeedleInHaystack {
    public static void main(String[] args) {

        String haystack = "mississippi";

        String needle = "pi";

        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        if (!needle.isEmpty() && haystack.isEmpty())
            return -1;

        for (int i = 0; i < haystack.length(); i++) {
            try {
                if (haystack.substring(i, i + needle.length()).equals(needle))
                    return i;
            } catch (Exception e) {
                return -1;

            }

        }
        return -1;
    }
}