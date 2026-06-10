package src.core.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Task {
    public static void main(String[] args) {
        // List<String> frameworkList = new ArrayList<>(15);
        // frameworkList.add("Hiber");
        // frameworkList.add("Spring boot");
        // frameworkList.add("Java core");
        // frameworkList.add("Spring Security");


        // System.out.println("Razmer spiska "+frameworkList.size());

        // String firstElemenet = frameworkList.get(0);
        // System.out.println(firstElemenet);

        // boolean hasSpring = frameworkList.contains("Java core");
        // System.out.println(hasSpring);

        // frameworkList.remove("Hiber");
        // frameworkList.remove(2);

        // System.out.println("Posle udaleniya" + frameworkList);


        // ==========================================
        // 📝 ТЕСТИРОВАНИЕ ТВОЕЙ ЗАДАЧИ
        // ==========================================
        System.out.println("--- Тестирование твоей задачи ---");
        
        List<Integer> testList = new ArrayList<>();
        testList.add(5);
        testList.add(12);
        testList.add(8);
        testList.add(25);
        testList.add(3);
        testList.add(12); // Дубликат

        System.out.println("Исходный список чисел: " + testList);

        // Вызов твоего метода
        List<Integer> result = filterAndModifyList(testList);

        System.out.println("Результат работы твоего метода: " + result);
        // Ожидаемый вывод: [10, 16, 50, 24] (числа 5 и 3 удалены, остальные умножены на 2, порядок сохранен)

    }
     /**
     * 📝 ЗАДАЧА ДЛЯ САМОСТОЯТЕЛЬНОЙ РЕАЛИЗАЦИИ
     * 
     * Условие:
     * На вход подается список чисел `List<Integer> numbers`.
     * Тебе нужно пройтись по нему и вернуть НОВЫЙ список, в котором:
     * 1. Будут отсутствовать (удалены) все числа, которые МЕНЬШЕ или РАВНЫ 5.
     * 2. Все оставшиеся числа должны быть УМНОЖЕНЫ на 2.
     * 3. Исходный порядок элементов должен сохраниться.
     * 
     * Подсказка: Создай внутри метода новый пустой `new ArrayList<>()`, 
     * пройдись обычным циклом for-each по входному списку, проверяй условия 
     * и добавляй нужные модифицированные элементы в свой новый список.
     */

    // public static List<Integer> filterAndModifyList(List<Integer> numbers){
    //     List<Integer> processedList = new ArrayList<>();
    //     processedList = numbers.stream()
    //     .filter((val)-> val > 5)
    //     .map((val) -> val * 2)
    //     .toList();

    //     return processedList;
    // }

    public static List<Integer> filterAndModifyList(List<Integer> numbers){
        List<Integer> processedList = new ArrayList<>();

        for (Integer elem : numbers) {
            if (elem > 5){
                processedList.add(elem * 2);
            }
        }

        return processedList;
    }
}
