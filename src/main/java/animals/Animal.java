package main.java.animals;

import main.java.food.Food;

public abstract class Animal {
    abstract void eat(Food food);
    private String speak;

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public Animal(String speak) {
        this.speak = speak;
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
        String voice();

    }

}

