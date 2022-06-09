package service;

import model.Student;

import java.util.Scanner;

public class StudentService {
    public Student create() {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = c.next();
        System.out.println("Enter Year");
        int year = c.nextInt();
        System.out.println("Enter gender 'f' (female) or 'm' (male)");
        char gender = c.next().charAt(0);
        System.out.println("Enter is PHD true/false");
        boolean isPHD = c.nextBoolean();
        return new Student(name,year,gender,isPHD);
    }
    public void femaleStudent(Student[]students){
        for (Student student:students ) {
            if(student.getGander()=='f'){
                student.printInfo();
            }
        }
    }
    public void sortOfAge(Student[] students) {
        Student temp = null;
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j - 1].getYear() < students[j].getYear()) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
        for (Student x : students) {
            x.printInfo();
        }

    }
    }

