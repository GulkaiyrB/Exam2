public class Student<averageMark> {
    private String firstName;
    private String lastName;
    private String group;
    private boolean isElder;
    private double averageMark;
    private int scholarship;

    public Student(String firstName, String lastName, String group, boolean isElder, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.isElder = isElder;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isElder() {
        return isElder;
    }

    public void setElder(boolean elder) {
        isElder = elder;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        if (this.averageMark == 5){
            return scholarship = 1000;
        }
        return scholarship = 800;
    }

    public static void  searchStudentByName(Student[] students, String firstName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(firstName)) {
                System.out.println("Студент с таким именем " + firstName + " есть!");
                return;
            }
        }
        System.out.println("Студент с таким именем " + firstName + " не найден!");
    }

}