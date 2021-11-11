import main.java.animals.Cat;
import main.java.animals.Horse;
import main.java.animals.Pegasus;

public class Zoo {
    public static void main(String [] args) {
        Horse mustang = new Horse(true,"Igogo", (byte) 4, "Rys", "White");
        Cat Charlie = new Cat("Black", "Metis");
        Pegasus ares = new Pegasus(true,"Igogo", (byte) 4, "Rys", "White");
        ares.fly();
        mustang.run();



    }
}
