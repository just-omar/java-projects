package src.core.intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. Класс final — запрет наследования
public final class ImmutableExample {

    public static final class Order {
        private final int id;
        // Список товаров — это изменяемый объект! Потокобезопасный код требует защиты.
        private final List<String> items;

        public Order(int id, List<String> items) {
            this.id = id;

            // 3. ГЛУБОКОЕ КОПИРОВАНИЕ в конструкторе:
            // Если мы просто напишем this.items = items, то человек извне сможет изменить
            // список,
            // который он передал в конструктор, и наш "неизменяемый" ордер изменится!
            // Поэтому создаем новый список и оборачиваем в unmodifiableList (запрет на
            // методы .add/.remove)
            this.items = Collections.unmodifiableList(new ArrayList<>(items));
        }

        public int getId() {
            return id;
        }

        // 3. ГЛУБОКОЕ КОПИРОВАНИЕ в геттере:
        // Возвращаем защищенный список, который нельзя модифицировать извне
        public List<String> getItems() {
            return items;
        }
    }

    public static void main(String[] args) {
        List<String> myItems = new ArrayList<>();
        myItems.add("Laptop");
        myItems.add("Phone");

        Order order = new Order(1, myItems);

        // Попытка взлома №1: меняем исходный список
        myItems.add("Juice");

        // Проверяем: изменился ли заказ?
        System.out.println("Товары в заказе: " + order.getItems());
        // Выведет только [Laptop, Phone]. Взлом не удался, конструктор защитил данные!

        // Попытка взлома №2: пробуем добавить товар напрямую в геттер
        order.getItems().add("Shoes"); // ОШИБКА! Вызовет
        // UnsupportedOperationException в рантайме.
    }
}