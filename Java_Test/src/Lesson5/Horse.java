package Lesson5;
import java.util.concurrent.ThreadLocalRandom;

public class Horse extends Animal {
        int randomNumRun = ThreadLocalRandom.current().nextInt(1200, 1800);
        double randomNumJump = ThreadLocalRandom.current().nextDouble(2.4, 3.2);
        int randomNumSwim = ThreadLocalRandom.current().nextInt(80, 120);

         Horse(String name) {
            this.name = name;
            this.run = randomNumRun;
            this.jump = randomNumJump;
            this.swim = randomNumSwim;
        }
    }

