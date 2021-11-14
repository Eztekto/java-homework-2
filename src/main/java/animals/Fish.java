package main.java.animals;


import main.java.actions.Swim;

public class Fish extends Carnivorous implements Swim {
    private String name;

    public Fish(String name) {
        super(name);
        this.name = name;
    }



    @Override
    public void swim() {
        System.out.println(name + " плавает");

    }
}
