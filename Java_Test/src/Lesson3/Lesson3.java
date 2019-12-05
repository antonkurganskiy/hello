package Lesson3;

import java.util.Scanner;

public class Lesson3 {

    private static final char player = 'X';
    private static final char ai = 'O';
    private static final char emptyCell = '_';

    private static boolean isCellempty(char[][] map){
        boolean result = true;
        for (int i=0; i < map.length; i++){
            for (int j =0; j < map.length; j++){
                if(map[i][j] == emptyCell) {
                    result= true;
                    break;
                }
                else {result =  false;}
            }
        }
        return result;
    }

    private static void drawField(char [][] map){
        System.out.println("    |  X | X | X ");
     //   System.out.println("__________________");
        for (int i=0; i < map.length; i++){
            System.out.print("| Y | ");
            for (int j =0; j < map.length; j++) {
                System.out.print(map[i][j] + "  |");
            }
            System.out.println();
        }
    }

    private static void clearField(char[][] map){
        for (int i=0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = emptyCell;
            }
        }
    }

    private static void humanTurn(char[][] map){
        Scanner scan = new Scanner(System.in);
        int y;
        int x;
        do {
            System.out.println(" Input Y coordinate from 1 to " + map.length + "to empty cell");
             y = scan.nextInt() - 1;
            System.out.println(" Input X coordinate from 1 to " + map.length + "to empty cell");
             x = scan.nextInt()  - 1;
        }
        while (map[y][x] != emptyCell);
        map[y][x] = player;
        }

    private static boolean checkWinRow(char[][] map, int fieldSize){
        int sum = 0;
        for (int i =0; i < fieldSize; i++){
            for (int j = 0; j <fieldSize; j++){
            if (map[i][j] == player) {
                sum++;
            }
            if ((j == (fieldSize -1 ) ) && (sum != (fieldSize))){
                sum = 0;
                }
                if (sum == (fieldSize)) {
                    return true;
            }
          }
        }
        return false;
    }

    private static boolean checkWinColumn(char[][] map, int fieldSize){
        int sum = 0;
        for (int i =0; i < fieldSize; i++){
            for (int j = 0; j <fieldSize; j++){
                if (map[j][i] == player) {
                    sum++;
                }
                if ((i == (fieldSize -1 ) ) && (sum != (fieldSize))){
                    sum = 0;
                }
                if (sum == (fieldSize)) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args){
       // Scanner scan = new Scanner(System.in);
        int fieldSize =3;
        boolean win;
        char [][] map = new char [fieldSize][fieldSize];
        clearField(map);
        drawField(map);
        do {
            humanTurn(map);
            drawField(map);
        }while (!checkWinRow(map, fieldSize) || !checkWinColumn(map, fieldSize));

    }
}
