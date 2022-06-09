package Model;
import Service.Human_Service;

public class Human {
     private String firstName;
     private String lastName;
     private int year;
     private char gender;
     private boolean isArmenian;


    public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public int getYear() {
                return year;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public char getGender() {
                return gender;
        }

        public void setGender(char gender) {
                this.gender = gender;
        }

        public boolean isArmenian() {
                return isArmenian;
        }

        public void setArmenian(boolean armenian) {
                isArmenian = armenian;
        }
    public Human (String name, int year, char gender, boolean isArmenian) {
        this.firstName = name;
        this.year = year;
        this.gender = gender;
        this.isArmenian = isArmenian();
    }

}
