class RemoveDupAdjStr {

    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        System.out.println(s);
        RemoveDupAdjStr rmdpstr = new RemoveDupAdjStr();

        System.out.println(rmdpstr.removeStrII(s, 3));
        // System.out.println(rmdpstr.checkIfEqual("a"));

    }

    public String removeStr(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (index < sb.length() - 1 && sb.length() > 0) {
            if (sb.charAt(index) == sb.charAt(index + 1)) {
                sb.delete(index, index + 2);
                index = 0;
            } else {
                index++;
            }

        }
        return sb.toString();
    }

    public String removeStrII(String s, int k) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (index < sb.length() - (k - 1) && sb.length() > 2) {
            if (checkIfEqual(sb.substring(index, index + (k)))) { // check for adjacent duplicates for n length
                sb.delete(index, index + (k)); // remove adjacent dups
                index = 0; // start again
            } else {
                index++; // otherwise iterate
            }

        }
        return sb.toString();
    }

    public boolean checkIfEqual(String s) { // method to check for adjacent dups for the given string
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1))
                return false;
        }
        return true;
    }

}