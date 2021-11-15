package main.java;

import main.java.animals.*;
import main.java.food.Grass;
import main.java.food.Meat;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.getName;

public class Aviary <T extends Animal> {
    private Map<String, T> pet_dict = new HashMap();
    private int[] size = new int[4];


    public Aviary(AviarySize size){
        this.size[0]=size.getWidth();
        this.size[1]=size.getHeight();
        this.size[2]=size.getWeight();
        this.size[3]=size.getAppetite();

    }



    public void Add(T pet) {
        if (pet.getSize()[0] <= size[0] && pet.getSize()[1] <= size[1] && pet.getSize()[2] <= size[2] && pet.getSize()[3] <= size[3]) {
            pet_dict.put(pet.getName(), pet);
            System.out.println(pet.getName() + " расположился в вольере");
        } else {
            System.out.println("Для " + pet.getName() + " нет места в вольере");
        }

    }

    public T Get_by_name(String name) {
        return this.pet_dict.get(name);
    }

    public void Kill_by_name(String name){
        this.pet_dict.remove(name);
    }
}
