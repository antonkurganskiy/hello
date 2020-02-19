package Lesson6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerClassAsIputStream {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new FileInputStream("test.txt"));
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }



    }

}
