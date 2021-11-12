package main.java.animals;


import main.java.actions.Swim;

public class Fish extends Carnivorous implements Swim {
    private String name;
    private String speak;

    public Fish(String name, String speak) {
        super(name, speak);
        this.speak = speak;
        this.name = name;
    }



    @Override
    public void swim() {
        System.out.println(name + " плавает");

    }
}
