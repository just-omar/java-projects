
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
        Cat cat2 = new Example1.Cat("Barsik");
        // Cat cat2 = new Cat("Barsik");

        System.out.println("Один и тот же кот? " + (cat1 == cat2));

        System.out.println("Имена одинаковые? " + cat1.isEqualTo(cat2));

        Car tesla = new Car("tesla");
        MyFirstTask.Car tesla2 = new MyFirstTask.Car("tesla");
        // Car tesla2 = new MyFirstTask.Car("tesla");
        // Car audi = new MyFirstTask.Car("tesla");
        PlainCar audi = new PlainCar("Audi"); // Никаких приставок и точек!
        System.out.println("Модель новой машины: " + audi.model);
    }
}
