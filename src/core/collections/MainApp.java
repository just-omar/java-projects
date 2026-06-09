package src.core.collections;

public class MainApp {
    public static void main(String[] args) {
        // Слева — общий контракт, справа — конкретный SMS-сервис
        NotificationService myService = new SmsNotificationService();

        // Робот отправляет СМС
        myService.sendNotification("Ваш код: 4422");
        // Выведет: Отправлено по SMS: Ваш код: 4422

        // ХОЧЕШЬ ПОМЕНЯТЬ SMS НА EMAIL?
        // Меняем только ОДНО слово справа! Слева всё остается прежним.
        myService = new EmailNotificationService();

        myService.sendNotification("Ваш счет готов");
        // Выведет: Отправлено по Email: Ваш счет готов
    }
}
