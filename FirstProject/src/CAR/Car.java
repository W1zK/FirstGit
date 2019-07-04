package CAR;


public class Car {
    public String name = "Default";
    public int price = 100;

    public Car() {
        this("no name");
    }


    public Car(String name) {
        this(name, 0);

    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public void show() {

        System.out.println("Name: " + name + "\tPrice: " + price);


    }

}
