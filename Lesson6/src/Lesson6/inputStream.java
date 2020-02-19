package Lesson6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class inputStream {
    public static void main(String[] args){

        try {
            FileInputStream fis = new FileInputStream("test.txt");
         //   System.out.println(fis.read());
            int b;
            while ((b = fis.read()) != -1){
                System.out.print((char) b);
            }


        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }



}
