package main.java.animals;

public class Cat extends Animal {
    String color;
    String breed;

    public Cat(String color, String breed) {
        super(false, "Meow", (byte) 4);
        this.color = color;
        this.breed = breed;
    }
}
