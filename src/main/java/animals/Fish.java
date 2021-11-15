package main.java.animals;


import main.java.actions.Swim;

public class Fish extends Carnivorous implements Swim {
    private String name;

    public Fish(String name, int width, int height, int weight, int appetite) {
        super(name, width, height, weight, appetite);
        this.name = name;
    }



    @Override
    public void swim() {
        System.out.println(name + " плавает");

    }
}
