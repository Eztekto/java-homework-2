package main.java.animals;

public class Pegasus extends Horse {
    public Pegasus(boolean veg, String speak, byte paw, String breed, String color){
        super(veg, speak, paw, breed, color);
    }
    public void fly() {
        System.out.println(speak + ", я полетел!");
    }
}
