package main.java.animals;

import main.java.food.Food;
import main.java.food.Grass;
import main.java.food.Meat;

public abstract class Carnivorous extends Animal {
    private String name;


    public Carnivorous(String name) {
        super(name);
        this.name = name;
    }
    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            System.out.println(name + " не ест траву");
        }
        if (food instanceof Meat){
            System.out.println(name + " любит мясо!");
        }

    }
}

