package Lesson5;
import java.util.concurrent.ThreadLocalRandom;

public class Dog extends Animal{

    int randomNumRun = ThreadLocalRandom.current().nextInt(400, 600 );
    double randomNumJump = ThreadLocalRandom.current().nextDouble(0.1, 0.6 );
    int randomNumSwim = ThreadLocalRandom.current().nextInt(8, 12 );

     Dog(String name) {
        this.name= name;
        this.run = randomNumRun;
        this.jump = randomNumJump;
        this.swim= randomNumSwim;
    }
}
