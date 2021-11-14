package main.java.employee;


import main.java.actions.Voice;
import main.java.animals.*;
import main.java.food.Food;

public class Worker {

    public void feed(Food food, Animal animal) {
        animal.eat(food);

    }


    public void getVoice(Voice voice){
       voice.voice();
   }


}
