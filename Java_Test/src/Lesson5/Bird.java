package Lesson5;
import java.util.concurrent.ThreadLocalRandom;
public class Bird extends Animal{
        int randomNumRun = ThreadLocalRandom.current().nextInt(4, 6);
        double randomNumJump = ThreadLocalRandom.current().nextDouble(0.1, 0.3);

        Bird (String name) {
            this.name = name;
            this.run = randomNumRun;
            this.jump = randomNumJump;
            this.swim = 0 ;
        }
    }

