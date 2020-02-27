package Lesson7;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {

    public static final int MODE_HUM_HUM = 0;
    public static final int MODE_AI_HUM = 1;

    Map(){
        setBackground(Color.LIGHT_GRAY);
    }

    void startNewGame (int mode, int fieldSizeX, int fieldSizeY, int winLenght ){
        System.out.printf("M: %d, FSX: %d, FSY: %d, WL: %d\n", mode, fieldSizeX, fieldSizeY, winLenght);

    }
}
