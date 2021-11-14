import main.java.employee.Worker;
import main.java.animals.*;
import main.java.food.Grass;
import main.java.food.Meat;

public class Zoo {
    public static void main(String [] args) {
        Horse horse = new Horse("Лошадь", "Игого");
        Cat cat = new Cat("Кот", "Мяу");
        Lion lion = new Lion("Лев","Раар");
        Cow cow = new Cow("Корова","Му");
        Meat meat = new Meat("Мясо");
        Grass grass = new Grass("Трава");
        Duck duck = new Duck("Утка", "Кря");
        Fish fish = new Fish("Рыба","Буль");
        Worker worker = new Worker();
        worker.getVoice(duck);
        worker.getVoice(cat);
        worker.getVoice(horse);
        worker.getVoice(lion);
        worker.getVoice(cow);
        worker.getVoice(duck);
        worker.feed(meat, fish);
        worker.feed(grass, fish);
        worker.feed(meat, horse);
        worker.feed(grass, horse);
        worker.feed(meat, cat);
        worker.feed(grass, cat);
        createPond();
    }
    private static void createPond() {
        Fish[] fish = new Fish[3];
        fish[0] = new Fish("Пиранья", "Буль");
        fish[1] = new Fish("Акула", "Буль");
        fish[2] = new Fish("Удильщик", "Буль");
        Duck[] duck = new Duck[3];
        duck[0] = new Duck("Аист", "Кря");
        duck[1] = new Duck("Лебедь", "Гра");
        duck[2] = new Duck("Гусь", "Га-га");
        for (int i = 0; i < 3; i++) {
            fish[i].swim();
        }
        for (int y = 0; y < 3; y++) {
            duck[y].swim();
        }


    }
}
