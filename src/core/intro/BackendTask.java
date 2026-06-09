package src.core.intro;

import java.util.List;
import java.util.stream.Collectors;

public class BackendTask {
    public record Order(int id, String status, int price) {
    }

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "PAID", 5000),
                new Order(2, "CREATED", 1200),
                new Order(3, "PAID", 300),
                new Order(4, "CANCELLED", 8000));

        List<Integer> paidOrdersList = orders.stream()
                .filter(o -> "PAID".equals(o.status()))
                .peek(o -> System.out.println("прошел фильтр " + o))
                .map(o -> o.id())
                .collect(Collectors.toList());

        System.out.println(paidOrdersList);
    }
}