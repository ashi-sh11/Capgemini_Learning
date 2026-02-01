package Task_01_02_2026.List;

import java.util.*;

public class Frequency {

    public static Map<String, Integer> findFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String item : list) {
            freqMap.put(item, freqMap.getOrDefault(item, 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> result = findFrequency(fruits);
        System.out.println(result);
    }
}

