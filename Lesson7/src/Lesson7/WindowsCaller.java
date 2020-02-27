package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        bStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });
        JButton bStop = new JButton("Stop game");
        bStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JPanel jBottom = new JPanel();
        jBottom.setLayout(new GridLayout(1, 2));
        jBottom.add(bStart, BorderLayout.NORTH);
        jBottom.add(bStop, BorderLayout.SOUTH);

        map = new Map();
        settingsWindow = new SettingsWindow(this);

        add(jBottom, BorderLayout.SOUTH);
        add(map,BorderLayout.CENTER);
        setVisible(true);

    }

    void startNewGame (int mode, int fieldSizeX, int fieldSizeY, int winLenght ){
        map.startNewGame( mode, fieldSizeX,  fieldSizeY, winLenght);

    }


}
