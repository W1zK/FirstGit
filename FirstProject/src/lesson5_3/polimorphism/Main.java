package lesson5_3.polimorphism;

import lesson5_3.polimorphism.Animals.Animal;
import lesson5_3.polimorphism.Animals.Cat;
import lesson5_3.polimorphism.Animals.Creature;
import lesson5_3.polimorphism.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animalsInZoo = { new Cat(), new Dog(), new Cat(), new Dog()};

        Cat cat1 = new Cat();
        cat1.kitty = "123";
        Animal animal1 = cat1;


        Creature creature = animal1;


    }
}
