package CAR;

public class Main {
    static void classObjectsExample() {
        Car car1 = new Car("BMW", 15000);
        car1.show();
        Car car2 = new Car("Lada", 1500);
        car2.show();
        Car car3 = new Car("Fiat", 8000);
        car3.show();
        Car car4 = new Car("Renault");
        car4.show();



    }
    static void constructorsExample() {

        Car car1 = new Car("BMW");
        Car car2 = new Car("Lada", 1000);
        Car car3 = new Car("Fiat", 0);
        Car car4 = new Car();

        car1.show();
        car2.show();
        car3.show();
        car4.show();

    }



    public static void main(String[] args) {

//        classObjectsExample();
        constructorsExample();





    }
}
