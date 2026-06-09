package src.core.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_MapCounter {
    public static void main(String[] args) {
        List<String> votes = List.of("Java", "blah", "JavaScript", "Java", "Python", "Java", "JavaScript");

        Map<String, Integer> resultCountMap = new HashMap<>();

        // for (String lang : votes) {
        // if (resultCountMap.containsKey(lang)) {

        // int currentCount = resultCountMap.get(lang);
        // resultCountMap.put(lang, currentCount + 1);
        // } else {
        // resultCountMap.put(lang, 1);
        // }
        // }

        for (String lang : votes) {
            resultCountMap.merge(lang, 1, Integer::sum);
        }
        System.out.println("Результаты подсчета: " + resultCountMap);
    }
}
