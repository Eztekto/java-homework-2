
import main.java.AviarySize;
import main.java.animals.*;
import main.java.Aviary;
import main.java.employee.Worker;
import main.java.food.Grass;
import main.java.food.Meat;

public class Zoo {
    public static void main(String [] args) throws BadFoodException {
        Horse horse = new Horse("Лошадь", "Игого", 4, 4,4,2);
      Cat cat = new Cat("Кот", "Мяу", 1, 1,1, 1);
        Lion lion = new Lion("Лев","Раар", 4, 2,3, 3);
        Cow cow = new Cow("Корова","Му", 2, 2,3, 3);
        Meat meat = new Meat("Мясо");
        Grass grass = new Grass("Трава");
        Duck duck = new Duck("Утка", "Кря", 1, 1,1, 1);
        Fish fish = new Fish("Рыба", 1, 1,1, 1);
        Worker worker = new Worker();
        Aviary<Herbivore> Herb_Avi = new Aviary(AviarySize.LARGE);
        Aviary<Carnivorous> Carn_Avi = new Aviary(AviarySize.NORMAL);
        Herb_Avi.Add(cow);
        Carn_Avi.Add(cat);
        Cow getAnimal = (Cow) Herb_Avi.Get_by_name("Корова");
        System.out.println(getAnimal.getName());
        Herb_Avi.Kill_by_name("Корова");
        Carn_Avi.Add(cat);



    }
    private static void createPond() {
        Fish[] fish = new Fish[3];
        fish[0] = new Fish("Пиранья", 1, 1,1, 1);
        fish[1] = new Fish("Акула", 1, 1,1, 1);
        fish[2] = new Fish("Удильщик", 1, 1,1, 1);
        Duck[] duck = new Duck[3];
        duck[0] = new Duck("Аист", "Кря", 1, 1,1, 1);
        duck[1] = new Duck("Лебедь", "Гра", 1, 1,1, 1);
        duck[2] = new Duck("Гусь", "Га-га", 1, 1,1, 1);
        for (int i = 0; i < 3; i++) {
            fish[i].swim();
        }
        for (int y = 0; y < 3; y++) {
            duck[y].swim();
        }


    }
}

