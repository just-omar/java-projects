
package src.core.collections;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Иван");
        names.add("Мария");
        names.add("Иван"); // Дубликат
        names.add("Петр");
        names.add("omar");

        // Переносим элементы в Set для удаления дубликатов
        Set<String> uniqueNames = new HashSet<>(names);

        System.out.println(uniqueNames); // Выведет: [Иван, Мария, Петр] (порядок может измениться)
    }
}

