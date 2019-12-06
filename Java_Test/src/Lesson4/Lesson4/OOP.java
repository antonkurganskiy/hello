package Lesson4.Lesson4;



public class OOP {

    public static void main (String[]args ) {
        Emploee[] emp = new Emploee[5];
        emp[0] = new Emploee("Ivanov Ivan Ivanovich", 30000, 30);
        emp[1] = new Emploee("Alekseev Aleksey Alekseyvich", 40000, 44);
        emp[2] = new Emploee("Karpov Karp Karpovich", 22000, 22);
        emp[3] = new Emploee("Snov Son Snovovich", 75000, 61);
        emp[4] = new Emploee("Ilyin Ilya Ivanovich", 43000, 45);
        for(int i=0; i<emp.length; i++){
            if(emp[i].getAge() > 40) {
                emp[i].dataPrint();
            }
            if(emp[i].getAge() > 45){
                emp[i].setWageRaise();
            }
        }



    }
}
