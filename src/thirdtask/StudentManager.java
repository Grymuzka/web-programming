package thirdtask;

import java.util.Arrays;
import java.util.Objects;

public class StudentManager {

    private Student[] students = new Student[5];

    public void addStudent(Student studentRequest) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = studentRequest;
                break;
            } else if (i == students.length - 1) {
                expandArray();
                students[i + 1] = studentRequest;
            }
        }
    }

    public void displayAllStudent() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public Student findStudentByIndex(String indexNumber) {
        return Arrays.stream(students)
                .filter(student -> Objects.equals(student.getIndexNumber(), indexNumber))
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Student not found"));
    }

    public void expandArray() {
        int newLength = students.length + 1;
        Student[] newStudents = new Student[newLength];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        students = newStudents;
        System.out.println("Expanded array length to " + students.length);
    }
}
