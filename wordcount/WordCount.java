package wordcount;
import java.io.*;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;

class WordCount {

    public static void main(String[] args) {
        try {
            wordCount();
        } catch (IOException e) {
            System.err.println("File error!!!");
        }

    }

    public static void wordCount() throws IOException {
        File file = new File("wordcount/test.txt");
        Scanner sc = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        int totalWords = 0; 

        HashMap<String, Integer> hm = new HashMap<>();
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine());
        }

        StringTokenizer stringTokenizer = new StringTokenizer(sb.toString());

        while (stringTokenizer.hasMoreTokens()) {
            String s = stringTokenizer.nextToken().replaceAll("[,|:|-|\\d]", "");
            totalWords++; 
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);
            } else if (!hm.containsKey(s)) {
                hm.put(s, 1);
            }
        }

        hm.remove("");

       Map<String,Integer> sortedMap =  sortByComparator(hm, true);

       System.out.println("Total Words: "+totalWords);
        for (String x : sortedMap.keySet()) {
            System.out.printf("%s:%d\t",x,hm.get(x));
        }

        sc.close();

    }

    public static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, boolean order) {

        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                if (order) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }


   
}