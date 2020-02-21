package Lesson6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerClassAsInputStream {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new FileInputStream("test.txt"));
            System.out.println(scanner.nextInt() + 555);
            while (scanner.hasNext()){

                System.out.println(scanner.nextLine());
            }
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }



    }

}
