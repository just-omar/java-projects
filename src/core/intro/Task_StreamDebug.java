package src.core.intro;

import java.util.List;
import java.util.stream.Collectors;

public class Task_StreamDebug {
    public static void main(String[] args) {
        List<Integer> prices = List.of(500, 1500, 800, 3000, 1200);

        List<Integer> discountedPrices = prices.stream()
                .peek(price -> System.out.println("\n--- Старт: " + price)) // Разделитель
                .filter(price -> price > 1000)
                .peek(price -> System.out.println(" Прошел фильтр: " + price))
                .map(price -> (int) (price * 0.9))
                .peek(finalPrice -> System.out.println(" Со скидкой: " + finalPrice))
                .collect(Collectors.toList());

        System.out.println("\nИтог: " + discountedPrices);
    }
}