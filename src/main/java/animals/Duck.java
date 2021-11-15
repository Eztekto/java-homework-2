package main.java.animals;

import main.java.actions.Fly;
import main.java.actions.Swim;
import main.java.actions.Voice;

import java.io.Flushable;

public class Duck extends Herbivore implements Swim, Fly, Voice {
    private String name;
    private String speak;

    public Duck(String name, String speak, int width, int height, int weight, int appetite) {
        super(name, speak, width, height, weight, appetite);
        this.speak = speak;
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println(name + " барахтается в пруду");

    }

    @Override
    public void fly() {
        System.out.println(name + " отправляется в полёт");
    }

    @Override
    public String voice() {
        System.out.println(name + " говорит " + speak);
        return this.speak;
    }
}
