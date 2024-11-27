import thirdtask.Student;
import thirdtask.StudentManager;

public class Main {

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student student1 = new Student("Alice", "Smith", "001");
        Student student2 = new Student("Bob", "Johnson", "002");
        Student student3 = new Student("Charlie", "Brown", "003");

        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

        System.out.println("Wszyscy studenci:");
        manager.displayAllStudent();

        System.out.println("Wyszukiwanie studenta o indeksie '002':");
        try {
            Student foundStudent = manager.findStudentByIndex("002");
            System.out.println("Znaleziono: " + foundStudent.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        manager.expandArray();
    }
}