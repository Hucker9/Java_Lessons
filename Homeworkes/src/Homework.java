import model.Student;

public class Homework {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFirstName("Georgi");
        s1.setLastName("Simonyan");
        s1.setPatronymic("Vardani");
        s1.setDay(12);
        s1.setMonth(3);
        s1.setYear(2002);
        s1.setGender('m');
        s1.setMark(56.2);
        s1.setArmenian(true);
        s1.setEmail("georgi.simonyan.100@gmail.com");
        System.out.println(s1.getFirstName()+" "+ s1.getLastName()+" "+ s1.getPatronymic());
        System.out.println("Day:"+ s1.getDay() + " "+"Month:"+s1.getMonth()+" Year:" +s1.getYear());
        System.out.println("Mark:" + s1.getMark());
        System.out.print("FromArmenia?:");
        System.out.println(s1.isArmenian()?"yes":"no");
        System.out.println("Email"+" "+s1.getEmail());
        System.out.println("----------------------------");

    }
}
