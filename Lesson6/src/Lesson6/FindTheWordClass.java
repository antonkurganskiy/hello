package Lesson6;

import java.io.*;
import java.util.Scanner;

public class FindTheWordClass {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write file name where are you willing to find this word");
        String fileName = scan.nextLine();
        System.out.println("Write word which you are willing to find");
        String wordToFind = scan.nextLine();
        boolean check = false;
        System.out.println("We are searching for word '' " + wordToFind + " ''" );
        try {
            Scanner scanner = new Scanner(new FileInputStream(fileName));                                    // We open the first file for reading;
            //Scanner scanner = new Scanner(new FileInputStream("test1.txt"));
            while (scanner.hasNext()){                                                                                 // Working with first file until it has something;
                if (scanner.next() != wordToFind){
                    System.out.println("This text does have this word");
                    check = true;
                    break;
                }
            }
            if (check = false) {
                System.out.println("This text doesn't have this word, sorry.");
            }

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
