public class Main {
    public static void main(String[] args) {
        Student daria = new Aspirant("Daria","Sokolova","Java",false,5,true);
        Student maria = new Aspirant("Maria","Chernova","Java",true,4.3,true);
        Student pavel = new Student("Pavel","Onoprienko","Pyton",false,4.5);
        Student elena = new Student("Elena","Klass","Pyton",true,5.0);

        Student[] students= new Student[5];
        students[0] = daria;
        students[1] = maria;
        students[2] = pavel;
        students[3] = elena;

        for (int i = 0; i < students.length; i++) {
            if(students[i] != null) {
                System.out.println("Сумма степендии студента " +  students[i].getFirstName() + " составляет " + students[i].getScholarship() + " сом");
            }
        }

        System.out.println("-------------------------------");

        Student.searchStudentByName(students,"Maria");
    }
}
