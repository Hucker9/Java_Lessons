package Service;

import Model.Student;

import java.nio.file.*;

public abstract class Service {
    static String URL = "C:\\Users\\georg\\IdeaProjects\\Java_Lessons\\Menu\\src\\Students";
    static String URL_1 ="C:\\Users\\georg\\OneDrive\\Desktop\\aaa.txt\\" ;



    public static Student[] read(String path) throws Exception {
        String[] s = Files.readAllLines(Paths.get(path)).toArray(new String[0]);
        Student[] students = new Student[s.length];
        for (int i = 0; i < s.length; i++) {
            String[] split = s[i].split(",");
            Student student = new Student(split[0], split[1], Integer.parseInt(split[2]), split[3].charAt(0), Double.parseDouble(split[4]));
            students[i] = student;
        }
        return students;
    }

    public static void write(Student[] students) throws Exception {
        for (Student student : students) {
            Files.write(Paths.get(URL), student.toString().getBytes(), StandardOpenOption.APPEND);
        }
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


    public static void candidateForRedDiploma(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() >= 90) {
                System.out.println("The candidate for red diploma" + "  " + students[i].getName());
            } else {
                System.out.println("you is not candidate for red diploma" + "  " + students[i].getName());
            }
        }

    }


    public static void expelledStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() < 40) {
                System.out.println("You have been removed ");
            }
        }
    }


}