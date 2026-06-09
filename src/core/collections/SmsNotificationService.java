
package src.core.collections;

class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println(" Отправлено по SMS: " + message);
    }

}