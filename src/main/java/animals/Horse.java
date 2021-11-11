package main.java.animals;

import main.java.food.Food;
import main.java.food.Grass;
import main.java.food.Meat;

public class Horse extends Herbivore implements Run, Voice{
    String name;
    String speak;

    public Horse(String name, String speak) {
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
            System.out.println("Люблю траву!");
        }

    }
    @Override
    public void run() {
        System.out.println("Я поскакал");

    }

    @Override
    public String voice() {
        System.out.println(speak);
        return speak;
    }
}
