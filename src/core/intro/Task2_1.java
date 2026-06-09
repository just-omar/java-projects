package src.core.intro;

public class Task2_1 {

    public static class User {
        public String email;

        public User(String email) {
            this.email = email;
        }
    }

    public static void main(String[] args) {
        // User user = new User("test@mail.ru");
        // User user2 = new User("test@mail.ru");

        // System.out.println(user == user2);

        // System.out.println(user.equals(user2));

        // System.out.println(user.email.equals(user2.email));

        String word1 = "React";
        String word2 = "React";

        System.out.println(word1 == word2);

        String original = "helloWorld";
        String part1 = "hello";
        String part2 = "World";
        String combined = part1 + part2;
        System.out.println(original == combined);
    }
}
