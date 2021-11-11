import main.java.Worker;
import main.java.animals.Animal;
import main.java.animals.Cat;
import main.java.animals.Horse;
import main.java.food.Food;
import main.java.food.Grass;
import main.java.food.Meat;

public class Zoo {
    public static void main(String [] args) {
        Horse horse = new Horse("Лошадь", "Игого");
        Cat cat = new Cat("Кот", "Мяу");
        Meat meat = new Meat("Мясо");
        Grass grass = new Grass("Трава");
        Worker worker = new Worker();

        worker.getVoice(horse);
    }
}
