package Service;

import Model.Plane;

import java.util.Scanner;

public class PlaneService {
    public Plane create() {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter Name of plane");
        String model = c.next();
        System.out.println("Enter the Country");
        String country = c.next();
        System.out.println("Enter the year");
        int year = c.nextInt();
        System.out.println("Enter the hours in the air");
        long hours = c.nextLong();
        System.out.println("Enter the Weight");
        int weight = c.nextInt();
        System.out.println("Enter the extent across of wings");
        byte wingspan = c.nextByte();
        System.out.println("Enter the speed");
        int speed = c.nextInt();
        System.out.println("Enter the seats");
        int seats = c.nextInt();
        System.out.println("Enter the cost");
        int cost = c.nextInt();
        Plane plane = new Plane(model, country, year, hours, weight, wingspan, speed, seats, cost);
        return plane;
    }

    public void task2(Plane plane) {
        if (plane.isMilitary() == true) {
            System.out.println(plane.getCost());
            System.out.println(plane.getTopSpeed());
        } else {
            System.out.println(plane.getModel());
            System.out.println(plane.getCountry());
        }
    }

    public Plane task3(Plane p, Plane p1) {
        if (p.getYear() > p1.getYear()) {

            return p;
        } else if (p.getYear() == p1.getYear()) {
            return p;
        } else {
            System.out.println(p1.getYear());
            return p1;
        }
    }

    public Plane task4(Plane p, Plane p1) {
        if (p.getWingspan() > p1.getWingspan()) {
            return p;
        } else if (p.getWingspan() == p1.getWingspan()) {
            return p1;
        } else {
            return p1;
        }
    }

    public void task5(Plane p, Plane p1, Plane p2) {
        if (p.getSeats() < p1.getSeats() && (p.getSeats() < p2.getSeats())) {
            System.out.println(p.getCountry());
        }
        if(p1.getSeats()<p.getSeats()&&(p1.getSeats()<p2.getSeats())){
            System.out.println(p1.getCountry());
        }
        if(p2.getSeats()<p.getSeats()&&p2.getSeats()<p1.getSeats()){
            System.out.println(p2.getCountry());
        }
    }
}

