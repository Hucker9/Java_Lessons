package Service;

import Model.Student;

import java.nio.file.*;

import java.util.Scanner;

public class Service {
    static String URL = "C:\\Users\\georg\\IdeaProjects\\Java_Lessons\\Menu\\src\\Students";

    public static Student studentCreate() {
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the student name");
        String name = m.next();
        System.out.println("Enter the student lastname");
        String lastName = m.next();
        System.out.println("Enter the student year");
        int year = m.nextInt();
        System.out.println("Enter the student gender 'f' or 'm' ");
        char gender = m.next().charAt(0);
        System.out.println("Enter the student mark");
        double mark = m.nextDouble();
        Student student = new Student(name, lastName, gender, year, mark);
        return student;
    }

    static Scanner y = new Scanner(System.in);

    public static void write1 ()throws Exception{
        System.out.println("how many students you want to create");
        int z = y.nextInt();
        int countOfStudents = z;
        Student[] students5 = new Student[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            students5[i] = studentCreate();
        }
        for (Student student : students5) {
            Files.write(Paths.get("C:\\Users\\georg\\OneDrive\\Desktop\\" + student.getName()), student.toString1().getBytes());
        }
    }

    public static void write(Student[] students) throws Exception {
        for (Student student : students) {
            Files.write(Paths.get(URL), student.toString().getBytes(), StandardOpenOption.APPEND);
        }
    }

    public static void write() throws Exception {
        System.out.println("how many students you want to create");
        int z = y.nextInt();
        int countOfStudents = z;
        Student[] students5 = new Student[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            students5[i] = studentCreate();
        }
        Service.write(students5);
    }

    public static void theFemaleStudents(Student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'f') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void theFemaleStudents() {
        System.out.println("how many students you want to create");
        int z = y.nextInt();
        int countOfStudents = z;
        Student[] students = new Student[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            students[i] = studentCreate();
        }
        theFemaleStudents(students);
    }

    public static void theBestFemaleStudent(Student[] students) {
        Student a = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'f') {
                if (a.getMark() <= students[i].getMark()) {
                    a = students[i];
                }
            }
        }
        System.out.println(a.getName() + " " + a.getMark());
    }

    public static void theBestFemaleStudent() {
        System.out.println("how many students you want to create");
        int z = y.nextInt();
        int countOfStudents = z;
        Student[] students1 = new Student[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            students1[i] = studentCreate();
        }
        theBestFemaleStudent(students1);
    }

    public static void sortByMarks(Student[] students) {
        Student temp = null;
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j - 1].getMark() > students[j].getMark()) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        for (Student x : students) {
            System.out.println(x.getName() + ":" + x.getMark());
        }
    }

    public static void sortByMarks() {
        System.out.println("how many students you want to create");
        int z = y.nextInt();
        int countOfStudents = z;
        Student[] students2 = new Student[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            students2[i] = studentCreate();
        }
        sortByMarks(students2);
    }

    public static void candidateForRedDiploma(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() >= 90) {
                System.out.println("The candidate for red diploma" + "  " + students[i].getName());
            } else {
                System.out.println("you is not candidate for red diploma" + "  " + students[i].getName());
            }
        }

    }

    public static void candidateForRedDiploma() {
        System.out.println("how many students you want to create");
        int z = y.nextInt();
        int countOfStudents = z;
        Student[] students3 = new Student[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            students3[i] = studentCreate();
        }
        candidateForRedDiploma(students3);
    }

    public static void expelledStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() < 40) {
                System.out.println("You have been removed ");
            }
        }
    }

    public static void expelledStudents() {
        System.out.println("how many students you want to create");
        int z = y.nextInt();
        int countOfStudents = z;
        Student[] students4 = new Student[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            students4[i] = studentCreate();
        }
        expelledStudents(students4);
    }

}

