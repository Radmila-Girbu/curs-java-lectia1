package ucode.lectia2.studentcondition;

public class MainClass {
    public static void main(String args[]) {
        StudentCondition student1 = new StudentCondition();
        student1.age = 18;
        student1.averageNoteSchool = 9;
        student1.noteBAC = 8;
        student1.noteExam1 = 10;
        student1.noteExam2 = 9;
        student1.isHealthy = true;
        student1.isStudent();

        StudentCondition student2 = new StudentCondition();
        student2.age = 15;
        student2.averageNoteSchool = 9;
        student2.noteBAC = 10;
        student2.noteExam1 = 10;
        student2.noteExam2 = 10;
        student2.isHealthy = true;
        student2.isStudent();
    }
}
