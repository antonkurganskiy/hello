package Lesson7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow extends JFrame {

    private static final int WINDOW_WIDTH = 350;
    private static final int WINDOW_HEIGHT = 230;
    private static final int MIN_WIN_LENGTH = 3;
    private static final int MIN_FIELD_SIZE =3;
    private static final int MAX_FIELD_SIZE = 10;
    private static final String FIELD_SIZE_PREFIX = "Field size is ";
    private static final String WIN_LENGTH_PREFIX = "Win legth is ";

    private WindowsCaller windowsCaller;
    private JRadioButton humVSAI;
    private JRadioButton humVSHUM;
    private JSlider slideWinLen;
    private JSlider slideFieldSize;

    SettingsWindow(WindowsCaller windowsCaller){
        this.windowsCaller = windowsCaller;
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Rectangle windowBounds = windowsCaller.getBounds();
        int posX = (int) windowBounds.getCenterX() - WINDOW_WIDTH / 2;
        int posY = (int) windowBounds.getCenterY() - WINDOW_HEIGHT / 2;
        setLocation(posX, posY);
        setResizable(false);
        setTitle("New Game");
        setLayout(new GridLayout(10, 1));
        addGameModeControls();
        addFieldControls();
        JButton btnStart = new JButton(" Apply settings ");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                applySettings();
            }
        });
        add(btnStart);

        //  setVisible(true);
    }

    private void addFieldControls() {
        JLabel lblFieldSize = new JLabel(FIELD_SIZE_PREFIX + MIN_FIELD_SIZE);
        JLabel lblWinLength = new JLabel(WIN_LENGTH_PREFIX + MIN_WIN_LENGTH);
        slideFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
        slideWinLen = new JSlider(MIN_WIN_LENGTH, MIN_FIELD_SIZE, MIN_WIN_LENGTH);
        slideFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = slideFieldSize.getValue();
                lblFieldSize.setText(FIELD_SIZE_PREFIX + currentValue);
                slideWinLen.setMaximum(currentValue);
            }
        });
        slideWinLen.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblWinLength.setText(WIN_LENGTH_PREFIX + slideWinLen.getValue());
            }
        });
        add(new JLabel("Choose build size: "));
        add(lblFieldSize);
        add(slideFieldSize);
        add (new JLabel("Choose win length: "));
        add(lblWinLength);
        add(slideWinLen);
    }

    private void addGameModeControls() {
        add (new JLabel("Choose game mode "));
        humVSAI = new JRadioButton("Human VS AI");
        humVSHUM = new JRadioButton("human VS human");
        ButtonGroup gameMode = new ButtonGroup();
        gameMode.add (humVSAI);
        gameMode.add (humVSHUM);
        add (humVSAI);
        add (humVSHUM);
        humVSAI.setSelected(true);
    }

    void applySettings(){
        int mode;
        if (humVSAI.isSelected()){
            mode = Map.MODE_AI_HUM;
        } else if (humVSHUM.isSelected()){
            mode = Map.MODE_HUM_HUM;
        } else{
            throw new RuntimeException("Unexpected game mode");
        }
        int fieldSize = slideFieldSize.getValue();
        int winLength = slideWinLen.getValue();


        windowsCaller.startNewGame(mode, fieldSize, fieldSize, winLength);
        setVisible(false);
     }
}
