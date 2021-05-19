package pl.edu.pja;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.addGrade("A",1);
        student.addGrade("B",5.5);
        student.addGrade("A",3.5);
        student.addGrade("A",4);
        student.addGrade("C",2.5);
        student.addGrade("D", 0);

        System.out.println("Srednia ocen z przedmiotu [A]: " + student.getAvgGrade("A"));
        System.out.println("Srednia ocen z przedmiotu [B]: " + student.getAvgGrade("B"));
        System.out.println("Srednia ocen z przedmiotu [C]: " + student.getAvgGrade("C"));
        System.out.println("Srednia ocen z przedmiotu [D]: " + student.getAvgGrade("D"));
        System.out.println("Srednia ocen z przedmiotu [E](nie ma takiego): " + student.getAvgGrade("E"));
    }
}
