package main.java.animals;

import main.java.actions.Run;
import main.java.actions.Voice;

public class Lion extends Carnivorous implements Voice, Run {
    private String name;
    private String speak;

    public Lion(String name, String speak, int width, int height, int weight, int appetite) {
        super(name, width, height, weight, appetite);
        this.speak = speak;
        this.name = name;

    }

    @Override
    public String voice() {
        System.out.println(name + " говорит " + speak);
        return this.speak;
    }

    @Override
    public void run() {
        System.out.println(name + " бежит");

    }
}
