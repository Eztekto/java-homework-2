package main.java.animals;

import main.java.food.Food;


interface Voice{
    String voice();
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


public abstract class Animal implements Voice{

    abstract void eat(Food food);


    private String name;
    private String speak;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public Animal(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }
}

