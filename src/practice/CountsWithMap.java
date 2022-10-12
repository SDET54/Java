package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountsWithMap {

    public static void main(String[] args) {

        String example = "dferlefdmlef";

        Map<Character, Integer> exampleMap = new LinkedHashMap<>();

        for (int i = 0; i < example.length(); i++) {
            if (!exampleMap.containsKey(example.charAt(i))) {
                exampleMap.put(example.charAt(i), 1);
            } else {
                exampleMap.put(example.charAt(i), exampleMap.get(example.charAt(i)) + 1);
            }
        }

        for (Map.Entry each : exampleMap.entrySet()) {
            System.out.println(each.getValue() + " times " + each.getKey() + " is used in word");
        }

    }
}
