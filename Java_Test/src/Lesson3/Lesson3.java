package Lesson3;

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
        for (int i=0; i < map.length; i++){
            for (int j =0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
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


    public static void main(String[] args){
        int fieldSize =3;
        char [][] map = new char [fieldSize][fieldSize];
        clearField(map);
        drawField(map);

    }


}
