package model;

public class Student {
    private String name;
    private int year;
    private char gander;
    private  boolean isPhd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getGander() {
        return gander;
    }

    public void setGander(char gander) {
        this.gander = gander;
    }

    public boolean isPhd() {
        return isPhd;
    }

    public void setPhd(boolean phd) {
        isPhd = phd;
    }

    public Student(String name, int year, char gander, boolean isPhd) {
        this.name = name;
        this.year = year;
        this.gander = gander;
        this.isPhd = isPhd;
    }
    public void printInfo(){
        System.out.println("name:"+name);
        System.out.println("year:"+year);
        System.out.println("gender"+(gander=='f'? "female":"male"));
        System.out.println("Is PHD:"+(isPhd?"yes":"no"));
    }
}
