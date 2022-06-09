public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("aaaa");
        student.setLastName("ssss");
        student.setYear(2002);
        student.setFaculty("vt");
        student.setStudentId(123586);
        Teacher teacher  = new Teacher();
        teacher.setFirstName("Vahag");
        teacher.setLastName("Khazaryan");
        teacher.setExperience((byte) 10);
        teacher.setSalary(122200);
        student.printInfo();
        System.out.println("--------------------");
        Human human = new Human();
        human.setFirstName("Georgi");
        human.setLastName("Simonyan");
        human.setYear(2002);
        human.printInfo();
    }
}
