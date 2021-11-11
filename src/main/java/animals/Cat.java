package main.java.animals;

import main.java.food.Food;

public class Cat extends Animal implements Voice, Run  {

    @Override
    void eat(Food food) {

    }

    public Cat(String name, String speak) {
        super(name, speak);

    }

    @Override
    public String voice() {
        return null;
    }

    @Override
    public void run() {

    }
}
