package main.java.animals;

import main.java.food.Food;


public abstract class Animal {
    private String name;
    private String speak;

    public Animal(String name, String speak) {
        this.name = name;
        this.speak = speak;
    }

    public abstract void eat(Food food);

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


}

