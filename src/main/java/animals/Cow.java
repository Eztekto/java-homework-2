package main.java.animals;

import main.java.actions.Run;
import main.java.actions.Voice;

public class Cow extends Herbivore implements Run, Voice {
    private String name;
    private String speak;

    public Cow(String name, String speak) {
        super(name, speak);
        this.speak = speak;
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println(name + " пасётся");

    }

    @Override
    public String voice() {
        System.out.println(name + " говорит " + speak);
        return speak;
    }
}
