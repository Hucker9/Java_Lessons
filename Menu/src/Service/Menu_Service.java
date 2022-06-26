package Service;

import Model.Student;

import java.util.Scanner;

public class Menu_Service {
    public Student studentCreate() {
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

    public void theFemaleStudents(Student[] students) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'f') {
                count++;
            }
        }
        System.out.println(count);
    }

    public void theBestFemaleStudent(Student[] students) {
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

    public void sortByMarks(Student[] students) {
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

    public void candidateForRedDiploma(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() >= 90) {
                System.out.println("The candidate for red diploma" + "  " + students[i].getName());
            } else {
                System.out.println("you is not candidate for red diploma" +"  "+ students[i].getName());
            }
        }

    }

    public void expelledStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() < 40) {
                System.out.println("You have been removed ");
            }
        }
    }

    public void menu() {
        int a = 1;
        while (a != 0) {
            Scanner x = new Scanner(System.in);
            System.out.println("to see the female students press 1");
            System.out.println("to see the best female students press 2");
            System.out.println("for sort the students by marks press 3");
            System.out.println("to see candidates for red diploma press 4 ");
            System.out.println("to see the expelled students press 5 ");
            System.out.println("press 0 to exit");
            int z = x.nextInt();
            a = z;
            switch (z) {
                case 1:
                    System.out.println("how many students you want to create");
                    int countOfStudents = x.nextInt();
                    Student[] students = new Student[countOfStudents];
                    for (int i = 0; i < countOfStudents; i++) {
                        students[i] = studentCreate();
                    }
                    theFemaleStudents(students);
                    break;
                case 2:
                    System.out.println("how many students you want to create");
                    countOfStudents = x.nextInt();
                    Student[] students1 = new Student[countOfStudents];
                    for (int i = 0; i < countOfStudents; i++) {
                        students1[i] = studentCreate();
                    }
                    theBestFemaleStudent(students1);
                    break;
                case 3:
                    System.out.println("how many students you want to create");
                    countOfStudents = x.nextInt();
                    Student[] students2 = new Student[countOfStudents];
                    for (int i = 0; i < countOfStudents; i++) {
                        students2[i] = studentCreate();
                    }
                    sortByMarks(students2);
                    break;
                case 4:
                    System.out.println("how many students you want to create");
                    countOfStudents = x.nextInt();
                    Student[] students3 = new Student[countOfStudents];
                    for (int i = 0; i < countOfStudents; i++) {
                        students3[i] = studentCreate();
                    }
                    candidateForRedDiploma(students3);
                    break;
                case 5:
                    System.out.println("how many students you want to create");
                    countOfStudents = x.nextInt();
                    Student[] students4 = new Student[countOfStudents];
                    for (int i = 0; i < countOfStudents; i++) {
                        students4[i] = studentCreate();
                    }
                    expelledStudents(students4);
                    break;
                case 0:
                break;
                default:
                    System.out.println("you type wrong number");
                    break;
            }
        }
    }
}


