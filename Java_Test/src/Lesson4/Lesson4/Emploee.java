package Lesson4.Lesson4;

public class Emploee {
    private String personalData;
    private int wage;
    private int age;
    private static int workNumber;
    private int personalNumber;

    Emploee(String personalData, int wage, int age) {
        this.personalData= personalData;
        this.wage = wage;
        this.age = age;
        this.personalNumber = (workNumber +=1);
    }

    void dataPrint(){
        System.out.println("Employee "+ this.personalData);
        System.out.println("His salary is " + this.wage);
        System.out.println("He is " + this.age + " years old");
        System.out.println("His personal work number = "+ this.personalNumber);
        System.out.println();
    }

    String getPersonalData(){
        return personalData;
    }
    int getWage(){
        return wage;
    }
    int getAge(){
        return age;
    }
    int getPersonalNumber(){
        return personalNumber;
    }
    static int getWorkNumber(){
        return workNumber;
    }
    void setWageRaise(){
        this.wage = (wage + 5000);
    }

     static void print40Plus(Emploee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > 40) {
                emp[i].dataPrint();
            }
        }
    }
    static void raise45PlusWage(Emploee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            if(emp[i].getAge() > 45){
                emp[i].setWageRaise();
            }
        }
    }
    static void averageEmployee(Emploee[] emp){
        int averageWage=0;
        int averageAge=0;
        for (int i = 0; i < emp.length; i++) {
            averageAge += emp[i].getAge();
            averageWage += emp[i].getWage();
        }
        System.out.println("Average age of employees is "+ averageAge / emp.length);
        System.out.println("Average wage of employees " + averageWage/emp.length);
    }
}
