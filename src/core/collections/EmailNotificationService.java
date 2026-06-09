package src.core.collections;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println(" Отправлено по Email: " + message);
    }
}
