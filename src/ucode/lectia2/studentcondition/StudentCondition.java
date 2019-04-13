package ucode.lectia2.studentcondition;

public class StudentCondition {


    public int age;
    public double averageNoteSchool;
    public int noteBAC;
    public int noteExam1;
    public int noteExam2;
    public double noteAverage;
    public boolean isHealthy;


    public void isStudent() {
        noteAverage = (averageNoteSchool + noteBAC + noteExam2 + noteExam1) / 4;
        if (age >= 16 && noteAverage >= 7.5 && isHealthy) {
            System.out.println("Accepted as a student");
        } else {
            System.out.println("Refused");
        }
    }
}


