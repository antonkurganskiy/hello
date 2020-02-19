package Lesson6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 1.Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
 * 2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
 * 3.* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
 * 4. ** Написать метод, проверяющий, есть ли указанное слово в папке
 */


public class L6 {
     public static void main(String[] Args){

         float delta;
         long startTime = System.nanoTime();
         System.out.println("Sample of stopwatch");
         delta = System.nanoTime() - startTime;
         System.out.printf("Delta %f\n", delta * 000001f);
    }
}
