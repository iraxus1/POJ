package pl.edu.pja;

public class Students implements Comparable{
    private final String name;
    private final String lastName;
    private final String indeks;

    public Students(String name, String lastName, String indeks) {
        this.name = name;
        this.lastName = lastName;
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "indeks='" + indeks + '\'' +
                '}';
    }

    @Override
    public int compareTo(final Object o) {
        final Students students = (Students) o;
        return this.indeks.compareTo(students.indeks);
    }
}
