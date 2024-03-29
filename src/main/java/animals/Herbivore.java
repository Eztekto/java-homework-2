package main.java.animals;

import main.java.food.Food;
import main.java.food.Grass;
import main.java.food.Meat;

public abstract class Herbivore extends Animal{
    private String name;
    private String speak;
    public Herbivore(String name, String speak) {
        super(name, speak);
        this.speak = speak;
        this.name = name;
    }
    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            System.out.println(name + " не ест мясо");
        }
        if (food instanceof Grass){
            System.out.println(name + " любит траву!");
        }

    }
}
