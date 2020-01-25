package Lesson5;

public abstract class Animal {
    String name;
    int run;
    double jump;
    int swim;

    void runCheck(int runDistance) {
        if (runDistance <= run) {
            System.out.println(name + " run for " + runDistance + " metres");
        } else{
            System.out.println(name + " Couldn't run so far! ");
        }
    }
    void jumpCheck(int jumpHeight) {
        if (jumpHeight<= jump) {
            System.out.println(name + " jump up " + jumpHeight + " metres");
        } else{
            System.out.println(name + " Couldn't jump so high! ");
        }
    }
    void swimCheck(int swimDistance){
        if (this.swim == 0 ){
            System.out.println(name + " Can't swim!");
        } else if (swimDistance <= swim){
            System.out.println(name + " swim for " + swimDistance + " meteres");
        } else{
            System.out.println(name + " couldn't swim so far");
        }
    }


    void printInfo(){
        System.out.println(this.name +" run for " + this.run + " meters and swim for " + this.swim + " metres and jumps for " + String.format("%.2f", this.jump) + " Metres");
    }
}
