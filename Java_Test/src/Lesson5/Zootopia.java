package Lesson5;
import java.util.Scanner;
/** Tasks
 * Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
 *
 * Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
 * В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
 * или высоту (для прыжков).
 *
 * У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.,
 * Лошадь 1500 м., Птица 5 м.,; прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
 * плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).
 *
 * При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
 * (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
 *
 * Добавить животным разброс в ограничениях. Тo есть
 * у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 * */
public class Zootopia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Dog d1 = new Dog("Le Chien");
        Dog d2 = new Dog("El Perro");
        Horse h1 =  new Horse("Bucefal");
        Cat c1 = new Cat("Barsic");
        Bird b1 = new Bird(" Twinky");
        Animal[] theZoo = {d1, d2, h1, c1, b1};
        for (int i = 0; i< theZoo.length; i++){
            theZoo[i].printInfo();
        }
        System.out.println("input distance for running");
        int runDistance = scan.nextInt();
        System.out.println("input height of jumping");
        int jumpHeight = scan.nextInt();
        System.out.println("input distance for swimming");
        int swimDistance = scan.nextInt();
        for (int i = 0; i< theZoo.length; i++){
            theZoo[i].runCheck(runDistance);
            theZoo[i].jumpCheck(jumpHeight);
            theZoo[i].swimCheck(swimDistance);
        }
    }


}
