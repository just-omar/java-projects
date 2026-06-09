package src.core.intro;

public class Example1 {

    public static class Cat {
        public String name;

        private Cat(String catName) {
            this.name = catName;
        }

        public boolean isEqualTo(Cat otherCat) {
            return this.name.equals(otherCat.name);
        }

    }

    public static void main(String[] args) {
        Example1.Cat cat1 = new Example1.Cat("Barsik");
        // Может обратиться напрямую через Cat без приставки Example1.Cat потому что мы
        // запускаем программу в этом же классе
        Cat cat2 = new Example1.Cat("Barsik");
        // Cat cat2 = new Cat("Barsik");

        System.out.println("Один и тот же кот? " + (cat1 == cat2));

        System.out.println("Имена одинаковые? " + cat1.isEqualTo(cat2));

        MyFirstTask.Car tesla = new MyFirstTask.Car("tesla");
        MyFirstTask.Car bmw = new MyFirstTask.Car("bmw");

        System.out.println(tesla.checkModel(bmw));
        // Car audi = new MyFirstTask.Car("tesla");

    }
}
