package main.java.animals;

import main.java.food.Food;
import main.java.food.Grass;
import main.java.food.Meat;

public class Horse extends Herbivore implements Animal.Run, Animal.Voice {
    String speak;



    public Horse(String speak) {
        super(speak);
        this.speak = speak;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            System.out.println("Я не ем мясо");
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
