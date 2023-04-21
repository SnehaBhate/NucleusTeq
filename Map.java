import java.util.HashMap;
import java.util.HashSet;

public class Map {
    public static void main(String[] args) {
        int[] lst = { 1, 1, 2, 2 };
        String str = "believe in yourself";

        HashMap<Character, Integer> frequencyMap = countFrequency(lst, str);

        // print the frequency of each element in the input list and string
        for (char c : frequencyMap.keySet()) {
            System.out.println(c + " = " + frequencyMap.get(c));
        }
    }

    public static HashMap<Character, Integer> countFrequency(int[] lst, String str) {
        // convert list to set to remove duplicates
        HashSet<Integer> uniqueList = new HashSet<>();
        for (int i : lst) {
            uniqueList.add(i);
        }

        // create a map with keys as elements of uniqueList and values as 0
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (int i : uniqueList) {
            frequencyMap.put((char) (i + '0'), 0);
        }

        // count the frequency of each element in the string
        for (char c : str.toCharArray()) {
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            }
        }

        return frequencyMap;
    }
}