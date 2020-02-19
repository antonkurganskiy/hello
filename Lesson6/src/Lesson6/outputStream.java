package Lesson6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class outputStream {
    public static void main(String[] args){
        OutputStream out;

        try {
            FileOutputStream fos = new FileOutputStream("test.txt", true);
            //StringBuilder s = new StringBuilder("Hello world of Streams");
            String s = " Hello String again ";
            fos.write(s.getBytes());
            fos.close();

        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
