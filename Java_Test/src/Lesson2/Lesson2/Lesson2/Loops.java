package Lesson2.Lesson2.Lesson2;
/**
 * The text of the tasks:
 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
 2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
 4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
 5 * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
 6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||, эти символы в массив не входят.
 7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
 8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
*/

import java.util.Arrays;

public class Loops {

    private static void changer(int[] arr1){
        for(int i=0; i < arr1.length; i++){         // going through the array;
            arr1[i] = (arr1[i] == 0) ? 1 : 0;       // ternary operator to change value inside of array;
            }
        }

    private static void filler (int[] arr2){
        arr2[0]=1;                                  // making exception,  before start adding 3 value;
            for(int i=1; i < arr2.length; i++){     // going through the array;
                arr2[i] = arr2[i-1] + 3;            // adding 3 to previous value;
            }
        }

    private static void multiple(int[] arr3){
        for (int i=0; i < arr3.length; i++){        // going through the array;
            if(arr3[i]<6)  arr3[i]*=2;              // checking ;
           }
        }

    private static int max(int[] arr3){
            int max1 = arr3[0];
            for (int i=0; i < arr3.length; i++) {        // going through the array;
                if (arr3[i] > max1) max1 = arr3[i];
            }
            return max1;
        }

    private static int min(int[] arr3){
        int min1 = arr3[0];
        for (int i=0; i < arr3.length; i++) {        // going through the array;
            if (arr3[i] < min1) min1 = arr3[i];
        }
        return min1;
    }

    private static void fillerForEmptyArrays(int[][] arr4) {
            for (int i = 0; i < arr4.length; i++) {        // going through the array;
                for (int j = 0; j < arr4.length; j++) {        // going through the array;
                    arr4[i][j] = i * j;
                }
            }
        }

    private static void diagonalChanger1(int[][] arr4) {
           for (int i = 0; i < arr4.length; i++) {        // going through the array;
               for (int j = 0; j < arr4.length; j++) {        // going through the array;
                    if(i == j) arr4[i][j]=1;
               }
           }
       }

    private static void diagonalChanger2(int[][] arr4) {
        for (int i =0; i < arr4.length; i++) {        // going through the array;
            for (int j = 0; j < arr4.length; j++) {        // going through the array;
                if((i + j +1) == arr4.length ) arr4[i][j]=1;
            }
        }
    }

    private static void printArray2(int [][] arr4){
        for (int i = 0; i < arr4.length; i++) {        // going through the array;
            for (int j = 0; j < arr4.length; j++) {        // going through the array;
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static boolean checkBalance(int[] arr3){
        int sumLeft = 0, sumRight = 0;
        boolean result = false;
        for (int i=0; i< arr3.length; i++)
            sumRight += arr3[i];
        for (int i=0; i< arr3.length; i++){
            if(sumLeft == (sumRight- arr3[i])){
                result = true;
            } else {
                sumLeft +=arr3[i];
                sumRight-=arr3[i];
            }

        }
        return result;
    }

    private static void mover(int[] arr5, int n){
        int buffer;
        if (n >=0){
        for (int i =0; i < arr5.length; i++){
            if ((i + n) < arr5.length) {
                buffer= arr5[i];
               arr5[i] = arr5[i+n];
               arr5[i+n] = buffer;
            } else{
                buffer= arr5[i];
                arr5[i] = arr5[i-n ];
                arr5[i-n]=buffer;
            }
            }
        }
    }

    public static void  main(String[] args){
        // Data center - here we initialize values;
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        int[] arr2 = new int[8];
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] arr5 = {1, 2, 3, 4, 5};
        int [][] arr4 = new int[5][5];
        int n=2;
        // start of implementing;
        System.out.println(Arrays.toString(arr1));    //what was before changing;                                       // Task1;
        changer(arr1);
        System.out.println(Arrays.toString(arr1));    //After changing;                                                 // End of task1;
        System.out.println(Arrays.toString(arr2));    //what was before changing;                                       // Task2;
        filler(arr2);
        System.out.println(Arrays.toString(arr2));    //After changing;                                                 // End of task2;
        System.out.println(Arrays.toString(arr3));    //what was before changing;                                       // Task2;
        multiple(arr3);
        System.out.println(Arrays.toString(arr3));    //After changing;                                                 // End of task3;
        System.out.println("In array " + Arrays.toString(arr3) + " Maximum value is " + max(arr3) + " and minimal is  " + min(arr3));
        fillerForEmptyArrays(arr4);
        printArray2(arr4);                              //what was before changing;                                     // Task4;
        diagonalChanger1(arr4);
        diagonalChanger2(arr4);
        System.out.println();
        printArray2(arr4);                               //After changing;                                              // End of Task 4;
        System.out.println("Our array where we check balance is "+ Arrays.toString(arr3));
        System.out.println("We have middle in array. it is " +checkBalance(arr3));
        System.out.println(Arrays.toString(arr5));    //Before changing;
        mover(arr5, n);
        System.out.println(Arrays.toString(arr5));    //After changing;
         }

}
