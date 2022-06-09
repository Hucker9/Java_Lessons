import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student s = service.create();
        Student s1 = service.create();
        Student s2 = service.create();
        Student [] students = {s,s1,s2};
        service.femaleStudent(students);
        service.sortOfAge(students);
    }
}
