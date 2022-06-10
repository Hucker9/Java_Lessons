package Model;

public class Plane {
    private String model;
    private String country;
    private int year = 2022;
    private int hours = 10000;
    private boolean isMilitary;
    private int weight = 16000;
    private int wingspan = 30;
    private int topSpeed = 1000;
    private int seats = 100;
    private int cost = 50;

    public Plane(String model, String country, int year, int hours, boolean isMilitary, int weight, int wingspan, int topSpeed, int seats, int cost) {
        this.model = model;
        this.country = country;
        if (year > 1200 && year < 2022) {
            this.year = year;
        } else {
            System.out.println("you type wrong number");
        }
        if (hours >= 0 && hours < 10000) {
            this.hours = hours;
        } else {
            System.out.println("you type wrong number");
        }
        if (isMilitary == true) {
            this.isMilitary = isMilitary;
        }
        if (weight >= 10000 && weight <= 16000) {
            this.weight = weight;
        } else {
            System.out.println("you type wrong number");
        }
        if (wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        } else {
            System.out.println("you type wrong number");
        }
        if (topSpeed > 0 && topSpeed < 1000) {
            this.topSpeed = topSpeed;
        } else {
            System.out.println("you type wrong number");
        }
        if (seats > 0) {
            this.seats = seats;
        } else {
            System.out.println("you type wrong number");
        }
        if (cost >= 0) {
            this.cost = cost;
        } else {
            System.out.println("you type wrong number");
        }
    }

    public String getModel() {
        return model;
    }


    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public int getHours() {
        return hours;
    }

    public boolean getIsMilitary() {
        return isMilitary;
    }

    public int getWeight() {
        return weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public int getCost() {
        return cost;
    }
    public void prinInfo(Plane plane){
        System.out.println("Plane name is :" + getModel());
        System.out.println("Your country is :" + getCountry());
        System.out.println("The plane created in :" + getYear());
        System.out.println("Plane mileage is :" + getHours());
        System.out.println("Is plane military or not :" + ((getIsMilitary())==true?"Yes":"No"));
        System.out.println("Planes weight is :" + getWeight());
        System.out.println("Planes wingspan is :" + getWingspan());
        System.out.println("Planes top speed is :" + getTopSpeed());
        System.out.println("The count of seats of plane :" + getSeats());
        System.out.println("The cost of plane: " + getCost());
    }
}
