package src.core.intro;

import java.util.List;
import java.util.stream.Collectors;

public class Task_LambdaLog {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Petr", "Alexey");

        List<String> result = names.stream()
                .filter(name -> {
                    // Пишем любой код прямо внутри фильтра!
                    System.out.println("[Внутри filter] Проверяем имя: " + name);
                    return name.length() > 4;
                })
                .map(name -> {
                    // И внутри маппинга тоже!
                    String upper = name.toUpperCase();
                    System.out.println("[Внутри map] Перевели в регистр: " + upper);
                    return upper;
                })
                .collect(Collectors.toList());

        System.out.println("\nИтог: " + result);
    }
}