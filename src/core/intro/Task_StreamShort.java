package src.core.intro;

import java.util.List;
import java.util.Optional;

public class Task_StreamShort {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Petr", "Alexey", "Maxim");

        System.out.println("--- СТАРТ СТРИМА ---");

        Optional<String> result = names.stream()
                .peek(name -> System.out.println("Проверяем имя: " + name))
                .filter(name -> name.length() > 4) // Ищем имя длиннее 4 букв
                .findFirst(); // Как только нашли ОДИН элемент, стрим ТУТ ЖЕ завершается

        System.out.println("--- КОНЕЦ СТРИМА ---");
        System.out.println("Результат: " + result.orElse("Не найдено"));
    }
}