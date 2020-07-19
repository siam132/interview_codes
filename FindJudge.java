import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class FindJudge {

    public static void main(String[] args) {

        int[][] trust = { { 1, 3 }, { 2, 3 }, { 3, 1 } };
        System.out.println(townJudge(trust, 3));
    }

    public static int townJudge(int[][] trust, int N) {

        if (N < 1) // Check for edge cases
            return -1;
        if (N == 1 && trust.length < 1)
            return 1;
        HashMap<Integer, Integer> hm = new HashMap<>(); // initializ hashmap for vote count
        HashSet<Integer> hs = new HashSet<>(); // initialize hashset for tracking unique voters
        for (int i = 0; i < trust.length; i++) {
            if (!hm.containsKey(trust[i][1])) {
                hm.put(trust[i][1], 1); // insert new recipient
            } else {
                int temp = (int) hm.get(trust[i][1]);
                hm.put(trust[i][1], ++temp); // increment vote count for potential judge
            }
            hs.add(trust[i][0]); // add possible new unique voter
        }

        for (Integer n : hm.keySet()) {
            if (hm.get(n) >= N - 1 && !hs.contains(n)) // check if vote count is more than one less than total
                return n; // num of people and the person didnt vote for anyone else

        }

        return -1;
    }

}