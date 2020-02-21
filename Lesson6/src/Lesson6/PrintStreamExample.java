package Lesson6;

import java.io.*;

public class PrintStreamExample {
    public static void main(String[] args) {
        try{
        PrintStream ps = new PrintStream(new FileOutputStream("test.txt", true));
        ps.println("PrintStream example");
        ps.flush();
        ps.close();
        }catch (IOException ex){
            ex.printStackTrace();
      /*  }catch (FileNotFoundException ex){
            ex.printStackTrace();
      */  }
    }
}
