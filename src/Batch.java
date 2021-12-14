import java.util.Objects;

public class Batch {
    private Student[] students;
    private int studentCount;

    public Batch() {
        students = new Student[4];

        students[0] = new Student("Gurbaaz", 1);
        students[1] = new Student("Manav", 2);
        students[2] = new Student("Jatin", 3);
        students[3] = new Student("Timmy", 4);

        studentCount = 4;
    }

    public Student getStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == student.getId() && Objects.equals(students[i].getName(), student.getName())) {
                return students[i];
            }
        }
        return null;
    }
}
