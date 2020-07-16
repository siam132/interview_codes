class LongestPalendromicSubString {

    public static void main(String[] args) {

        String str = "baaaab";
        LongestPalendromicSubString lps = new LongestPalendromicSubString();
        System.out.println(lps.longestSubStr(str));

    }

    public String longestSubStr(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            int currLen = Math.max(expandFromMiddle(s, i, i), expandFromMiddle(s, i, i + 1));

            if (currLen > maxLen) {
                start = i - ((currLen - 1) / 2);
                end = i + (currLen / 2);
                maxLen = currLen;

            }
        }

        return s.substring(start, end + 1);
    }

    public int expandFromMiddle(String s, int left, int right) {
        if (s == null || left > right)
            return 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

}

// "aabbaa"
//
//