package main.java.animals;

import main.java.food.Food;

public abstract class Animal {
    boolean vegetarian;
    String speak;
    byte paw;

    public Animal(boolean veg, String speak, byte paw) {
        this.vegetarian = veg;
        this.speak = speak;
        this.paw = paw;
    }

    interface Run{
        void run();

    }
    interface Swim{
        void swim();

    }
    interface Fly{
        void fly();

    }
    interface Voice{
        void voice();

    }
}

