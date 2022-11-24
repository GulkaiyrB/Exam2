public class Aspirant extends Student {
   private  boolean isScientificWork;
    private int scholarship;

    public Aspirant(String firstName, String lastName, String group, boolean isElder, double averageMark, boolean isScientificWork) {
        super(firstName, lastName, group, isElder, averageMark);
        this.isScientificWork = isScientificWork;
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5){
            return scholarship = 2000;
        }
        return scholarship = 1800;
    }

}
