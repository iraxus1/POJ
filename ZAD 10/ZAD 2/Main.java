package pl.edu.pja;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.addGrade(1);
        student.addGrade(5.5);
        student.addGrade(3.5);
        student.addGrade(4);
        student.addGrade(2.5);

        System.out.println("Srednia ocen: " + student.getAvgGrade());
    }
}
