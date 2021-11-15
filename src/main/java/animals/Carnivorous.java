package main.java.animals;

import main.java.food.Food;
import main.java.food.Grass;
import main.java.food.Meat;

public abstract class Carnivorous extends Animal {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public Carnivorous(String name, int width, int height, int weight, int appetite) {
        super(name, width, height, weight, appetite);
        this.name = name;
    }
    @Override
    public void eat(Food food) throws BadFoodException {
            if (food instanceof Meat) {
                System.out.println(name + " любит мясо!");
            }
            else{
       throw new BadFoodException();
            }
    }
}



