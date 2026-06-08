public class MyFirstTask {

    static class Car {
        public String model;

        public Car(String model) {
            this.model = model;
        }

        public boolean checkModel(Car otherCar) {
            return this.model.equals(otherCar.model);
        }
    }
}
