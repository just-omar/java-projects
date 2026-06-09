public class StringCompareExample {
    public static void main(String[] args) {
        // Создаем две строки через ключевое слово new (принудительно создаем два разных
        // объекта в Куче)
        String str1 = new String("Java");
        String str2 = new String("Java");

        // 1. Сравниваем через == (сравниваем адреса в памяти)
        System.out.println("str1 == str2: " + (str1 == str2)); // Выведет false! Объекты разные.

        // 2. Сравниваем через .equals() (сравниваем буквы внутри объектов)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // Выведет true! Буквы одинаковые.
    }

}
