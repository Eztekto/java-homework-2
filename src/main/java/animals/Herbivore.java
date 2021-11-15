package main.java.animals;

import main.java.food.Food;
import main.java.food.Grass;
import main.java.food.Meat;

public abstract class Herbivore extends Animal{
    private String name;
    private String speak;
    public Herbivore(String name, String speak, int width, int height, int weight, int appetite) {
        super(name, width, height, weight, appetite);
        this.speak = speak;
        this.name = name;
    }
    @Override
    public void eat(Food food) throws BadFoodException {
        if (food instanceof Grass){
            System.out.println(name + " любит траву!");
        }
        else{
            throw new BadFoodException();
        }

    }
}
