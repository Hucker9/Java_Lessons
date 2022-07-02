package Model;

import Service.Menu_Service;

import java.text.ParseException;

public class Student {
    private String name;
    private String lastName;
    private int year;
    private char gender;
    private double mark;

    public Student(String name, String lastName, char gender, int year, double mark) {
        if (name.isEmpty() == false) {
            this.name = name;
        }
        if (lastName.isEmpty() == false) {
            this.lastName = lastName;
        }
        if (gender == 'm') {
            this.gender = gender;
        } else if (gender == ('f')) {
            this.gender = gender;
        } else {
            System.out.println("you type wrong letter");
        }
        if (year >= 1925 && year <= 2022) {
            this.year = year;
        }
        if (mark >= 0 && mark <= 100) {
            this.mark = mark;
        }


    }

    public String getName() {
        return name;
    }


    public String getLastName() {
        return lastName;
    }


    public int getYear() {
        return year;
    }

    public char getGender() {
        return gender;
    }


    public double getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student name :" + name + "\n" +
                "Student lastname :" + lastName + "\n" +
                "Student year :" + year + "\n" +
                "Student gender :" + gender + "\n" +
                "Student mark :" + mark + "\n" + "-----------------------" + "\n";

    }
    public String toString1() {
        return "Student name :" + name + "\n" +
                "Student lastname :" + lastName + "\n" +
                "Student year :" + year + "\n" +
                "Student gender :" + gender + "\n" +
                "Student mark :" + mark + "\n";

    }

}