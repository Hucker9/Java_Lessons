package Service;

import Model.Plane;

import java.util.Scanner;

public class PlaneService {
    Scanner c = new Scanner(System.in);

    public Plane create() {
        System.out.println("Enter the plane name");
        String model = c.next();
        System.out.println("Enter the country");
        String country = c.next();
        System.out.println("Enter the year");
        int year = c.nextInt();
        System.out.println("Enter the hours in the air");
        int hours = c.nextInt();
        System.out.println("The plane is military or not type (true/false)");
        boolean isMilitary = c.nextBoolean();
        System.out.println("Enter the weight of plane");
        int weight = c.nextInt();
        System.out.println("Enter the wingspan");
        int wingspan = c.nextInt();
        System.out.println("Enter the Top speed");
        int topSpeed = c.nextInt();
        System.out.println("Enter the count of seats");
        int seats = c.nextInt();
        System.out.println("Enter the cost");
        int cost = c.nextInt();
        Plane plane = new Plane(model, country, year, hours, isMilitary, weight, wingspan, topSpeed, seats, cost);
        return plane;
    }

    public void task2(Plane plane) {
        if (plane.getIsMilitary() == true) {
            System.out.println("The planes cost is :" + plane.getCost());
            System.out.println("The planes top speed is :" + plane.getTopSpeed());

        } else {
            System.out.println("The planes Name is :" + plane.getModel());
            System.out.println("The planes country is :" + plane.getCountry());
        }
    }

    public Plane task3(Plane p1, Plane p2) {
        if (p1.getYear() > p2.getYear()) {
            return p1;
        } else if (p1.getYear() == p2.getYear()) {
            return p1;
        } else {
            return p2;
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
        if (p.getSeats() > p1.getSeats() && p.getSeats() > p2.getSeats()) {
            System.out.println(p.getCountry());
        }
        if (p1.getSeats() > p.getSeats() && p1.getSeats() > p2.getSeats()) {
            System.out.println(p1.getCountry());
        }
        if (p2.getSeats() > p.getSeats() && p2.getSeats() > p1.getSeats()) {
            System.out.println(p2.getCountry());
        }
        if (p2.getSeats() == p.getSeats() && p2.getSeats() == p1.getSeats()) {
            System.out.println(p.getCountry());
        }
    }

    public void task6(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.getIsMilitary() == false) {
                System.out.println(plane.getModel());
            } else {
                System.out.println("That plane is not military");
            }
        }
    }

    public void task7(Plane[] planes) {
        for (Plane plane : planes) {
            if (plane.getIsMilitary() == true) {
                if (plane.getHours() >= 100) {
                    System.out.println(plane.getModel());
                }
            } else {
                System.out.println("That plane is not military");
            }
        }
    }

    public Plane task8(Plane[] planes) {
        Plane min = planes[0];
        for (Plane plane : planes) {
            if (plane.getWeight() <= min.getWeight()) {
                min = plane;
            }
        }
        return min;
    }

    public Plane task9(Plane[] planes) {
        Plane minCost = null;
        for (int i = 0; i < planes.length; i++) {
            if (minCost == null) {
                if (planes[i].getIsMilitary()) {
                    minCost = planes[i];
                }
            } else if (planes[i].getIsMilitary() && planes[i].getCost() < minCost.getCost()) {
                minCost = planes[i];
            }
        }
        if (minCost == null) {
            System.out.println();
        }
        return minCost;
    }
    public void task10(Plane[]planes){
        Plane temp = null;
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length-i; j++) {
                if(planes[j-1].getYear()<planes[j].getYear()){
                    temp = planes[j-1];
                    planes[j-1] = planes[j];
                    planes[j]=temp;
                }
            }
            for (Plane x:planes ) {
                System.out.println(x.getCost());
            }
        }
    }
}