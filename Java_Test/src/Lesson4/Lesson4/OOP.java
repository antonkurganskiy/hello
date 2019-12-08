package Lesson4.Lesson4;
/** Tasks
 * 1.Создать класс "Сотрудник" с полями: ФИО,зарплата, возраст;
 * 2.Конструктор класса должен заполнять эти поля при создании объекта;
 * 3.Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
 * 4.Вывести в консоль при помощи методов из пункта 3 ФИО и возраст.
 * 5.Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 * 6.* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
 * 7.** Написать методы (принимающие на вход массив сотрудников), вычисляющие средний возраст и среднюю зарплату сотрудников, вывести результаты работы в консоль.
 * 8.*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался личный уникальный идентификационный порядковый номер
*/
public class OOP {
    private static void print40Plus(Emploee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > 40) {
                emp[i].dataPrint();
            }
        }
    }
    private static void raise45PlusWage(Emploee[] emp) {
        for (int i = 0; i < emp.length; i++) {
            if(emp[i].getAge() > 45){
                emp[i].setWageRaise();
            }
        }
    }
    private static void averageEmployee(Emploee[] emp){
        int averageWage=0;
        int averageAge=0;
        for (int i = 0; i < emp.length; i++) {
            averageAge += emp[i].getAge();
            averageWage += emp[i].getWage();
        }
        System.out.println("Average age of employees is "+ averageAge / emp.length);
        System.out.println("Average wage of employees " + averageWage/emp.length);
    }

    public static void main (String[]args ) {
        Emploee[] emp = new Emploee[5];
        emp[0] = new Emploee("Ivanov Ivan Ivanovich", 30000, 30);
        emp[1] = new Emploee("Alekseev Aleksey Alekseyvich", 40000, 44);
        emp[2] = new Emploee("Karpov Karp Karpovich", 22000, 22);
        emp[3] = new Emploee("Snov Son Snovovich", 75000, 61);
        emp[4] = new Emploee("Ilyin Ilya Ivanovich", 43000, 45);
        print40Plus(emp);
        raise45PlusWage(emp);
        print40Plus(emp);
        averageEmployee(emp);

    }
}
