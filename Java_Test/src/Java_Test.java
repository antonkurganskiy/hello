import java.util.Scanner;

public class Java_Test {

    public static float calc(int a, int b, int c, int d) {                                                              // calculating
        float result;
        result = a * (b + (c *1.0f/ d));
        return result;
    }

    public static boolean check (int A1, int A2){                                                                       //Checking if sum in range between 10 and 20
        //boolean result;
        if ((A1 + A2) >= 10 && (A1 + A2) <= 20){
        return true;
        } else return false;
    }

    public static void checkSymbol(int B1){                                                                             // checking number
        if (B1 >= 0){
            System.out.println("Number is bigger or equal to zero");
        }else{
            System.out.println("Number is less than zero");
        }
    }

    public static void checkYear(int year){
        if ( (year % 400) == 0) {
            System.out.println("in this February 29 dates");
        }else if ((year % 100) == 0){
            System.out.println("just a regular year");
        } else if ((year % 4)== 0) {
            System.out.println("in this February 29 dates");
        }else{
            System.out.println("just a regular year");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c , d, A1, A2, B1, year;
        System.out.println("Input number a");                                                                         //Task 1;
        a = input.nextInt();
        System.out.println("Input number b");
        b = input.nextInt();
        System.out.println("Input number c");
        c = input.nextInt();
        System.out.println("Input number d");
        d = input.nextInt();
        System.out.println("the result of  a * (b + (c / d)) is = " + calc( a, b, c, d));                          //End of Task1;

       /* System.out.println("Input number A1");                                                                          //Task 2
        A1 = input.nextInt();
        System.out.println("Input number A2");
        A2 = input.nextInt();
        System.out.println("The sum of A1 and A2 is in range between 10 and 20. It is " + check(A1, A2));               //End of Task2;
*/
      /*  System.out.println("Input number B1");                                                                        //Task 3;
        B1 = input.nextInt();
        checkSymbol(B1);*/                                                                                              // End of Task 3;

      /*  String name;                                                                                                    // Task 4;
        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println(" Hello, " + name + ". Nice to meet you! ");                                                 //End of task 4;
*/
      /*  System.out.println("input the year");                                                                           //Task 5;
        year = input.nextInt();
        checkYear(year);     */                                                                                          // end of Task 5;
    }
}
