package Lesson7;

import javax.swing.*;
import java.awt.*;

public class WindowsCaller extends JFrame {

    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_POS_X = 650;
    private static final int WINDOW_POS_Y = 250;

    private  Map map;
    private SettingsWindow settingsWindow;


    WindowsCaller(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POS_X,WINDOW_POS_Y);
        setResizable(false);
        setTitle("TicTacToe");
        JButton bStart = new JButton("Start new Game");
        JButton bStop = new JButton("Stop game");
        JPanel jBottom = new JPanel();
        jBottom.setLayout(new GridLayout(1, 2));
        jBottom.add(bStart, BorderLayout.NORTH);
        jBottom.add(bStop, BorderLayout.SOUTH);

        map = new Map();
        settingsWindow = new SettingsWindow();

        add(jBottom, BorderLayout.SOUTH);
        add(map,BorderLayout.CENTER);

        setVisible(true);

    }


}
