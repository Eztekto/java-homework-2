package main.java.animals;

import main.java.food.Food;

import java.security.Key;


public abstract class Animal {
    private int width, height, weight, appetite;
    private String name;




    private int [] size = new int[4];

    public Animal(String name, int width, int height, int weight, int appetite) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.appetite = appetite;
        size[0] = width;
        size[1] = height;
        size[2] = weight;
        size[3] = appetite;


    }
    public int[] getSize() {
        return size;
    }

    public abstract void eat(Food food) throws BadFoodException;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        @Override
        public int hashCode() {
            int result = name == null ? 0 : name.hashCode();
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Animal that = (Animal) obj;
            return name == that.name;
        }

    }


