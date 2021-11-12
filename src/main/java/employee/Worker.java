package main.java.employee;


import main.java.animals.*;
import main.java.food.Food;

public class Worker {

    public void feed(Food food, Animal animal) {
        animal.eat(food);

    }



    public void getVoice(Cat cat){
        cat.voice();
    }

    public void getVoice(Horse horse){
        horse.voice();
    }
    public void getVoice(Lion lion){
        lion.voice();
    }
    public void getVoice(Cow cow){
        cow.voice();
    }
    public void getVoice(Duck duck){
        duck.voice();
    }
//    public void getVoice(Fish fish){
//        fish.voice();
//    }


}
