package Service;


import java.util.Scanner;

public class Menu_Service extends Service_1 {
    public static void menu() throws Exception {
        int a = 1;
        while (a != 0) {
            Scanner x = new Scanner(System.in);
            System.out.println("--------MENU--------");
            System.out.println("press '1' to see the count of female students ");
            System.out.println("press '2' to see the best female students ");
            System.out.println("press '3' for sort the students by marks");
            System.out.println("press '4' to see candidates for red diploma ");
            System.out.println("press '5'to see the expelled students ");
            System.out.println("press '6' print all students in one folder ");
            System.out.println("press '7' to print the students  on desktop each in another folder");
            System.out.println("press '0' to exit");
            int z = x.nextInt();
            a = z;
            switch (z) {
                case 1:
                    theFemaleStudents();
                    break;
                case 2:
                    theBestFemaleStudent();
                    break;
                case 3:
                    sortByMarks();
                    break;
                case 4:
                    candidateForRedDiploma();
                    break;
                case 5:
                    expelledStudents();
                    break;
                case 6:
                    write();
                    break;
                case 7:
                    write1();
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