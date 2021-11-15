package main.java.animals;

import main.java.food.Food;

public class BadFoodException extends Exception {
    public BadFoodException(){
        super("При распределение еды была допущена ошибка");

    }

}
