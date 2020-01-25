package Lesson5;
import java.util.concurrent.ThreadLocalRandom;
public class Cat extends Animal {

        int randomNumRun = ThreadLocalRandom.current().nextInt(160, 240);
        double randomNumJump = ThreadLocalRandom.current().nextDouble(1.6, 2.2);

         Cat(String name) {
            this.name = name;
            this.run = randomNumRun;
            this.jump = randomNumJump;
            this.swim = 0 ;
        }
    }
