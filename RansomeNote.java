import java.util.HashMap;
import java.util.Scanner;

public class RansomeNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (String x : magazine) {
            if (!hm.containsKey(x)) {
                hm.put(x, 1);
            } else {
                int temp = hm.get(x).intValue();
                hm.replace(x, temp++);
            }
        }

        for (String x : note) {
            if (hm.containsKey(x)) {
                int temp = hm.get(x);
                hm.replace(x, temp--);
            } else {
                System.out.println("NO");
            }
        }

        System.out.println("YES");

    }

    /*
     * hashmap = magazine {word : count}
     * 
     * for(i 0 to note.len) if(hm.contaians(note[i]))
     * hm.replace(note[i],hm.get(i)--) else sys.out(NO)
     * 
     * sys.out(YES)
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
