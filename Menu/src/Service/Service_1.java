package Service;

import Model.Student;

import java.nio.file.Files;

import java.nio.file.Paths;

import java.nio.file.StandardOpenOption;

import java.util.Scanner;

public class Service_1 extends Service {
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
        Student student = new Student(name, lastName, year, gender, mark);
        return student;
    }

    static Scanner y = new Scanner(System.in);

    public static void readAndWrite() throws Exception {
        Student[] students = read("C:\\Users\\georg\\OneDrive\\Desktop\\aaa.txt");
        for (Student student : students) {
            Files.write(Paths.get("C:\\Users\\georg\\OneDrive\\Desktop\\" + student.getName()), student.toString1().getBytes());
        }
    }

    public static void write2() throws Exception {
        System.out.println("how many students you want to create");
        int z = y.nextInt();
        int countOfStudents = z;
        Student[] students7 = new Student[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            students7[i] = studentCreate();
        }
        for (Student student : students7) {
            Files.write(Paths.get("C:\\Users\\georg\\OneDrive\\Desktop\\aaa.txt"), student.toString2().getBytes(), StandardOpenOption.APPEND);
        }
    }

    public static void write1() throws Exception {
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

    public static void write() throws Exception {
        System.out.println("how many students you want to create");
        int c = y.nextInt();
        int countOfStudents = c;
        Student[] students6 = new Student[countOfStudents];
        for (int i = 0; i < countOfStudents; i++) {
            students6[i] = studentCreate();
        }
        Service.write(students6);
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
