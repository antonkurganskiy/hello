package Lesson6;

import java.io.*;
import java.util.Scanner;

/**
 * 1.Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
 * 2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
 * 3.* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
 * 4. ** Написать метод, проверяющий, есть ли указанное слово в папке
 */


public class L6 {
     public static void main(String[] Args){
         try {
             Scanner scanner = new Scanner(new FileInputStream("file2.txt"));                                    // We open the first file for reading;
             PrintStream ps = new PrintStream(new FileOutputStream("file1.txt",true));                   // We open Stream to second file for writing;
             while (scanner.hasNext()){                                                                                 // Working with first file until it has something;
                 //System.out.println(scanner.nextLine());  // test line that file was opened;
                 ps.println(scanner.nextLine());                                                                        // Writing to file this line;
             }
         }catch (FileNotFoundException ex){
             ex.printStackTrace();
         }catch (IOException ex){
             ex.printStackTrace();
         }


    }
}
