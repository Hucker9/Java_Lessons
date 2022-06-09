package Model;

public class Plane {
    String model;
    String country;
    int year;
    long hours;
    boolean isMilitary;
    int weight;
    byte wingspan;
    int topSpeed;
    int seats;
    int cost;

    public Plane(String model, String country, int year, long hours, int weight, byte wingspan, int speed, int seats, int cost) {
        this.model = model;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.weight = weight;
        this.wingspan = wingspan;
        this.topSpeed = speed;
        this.seats = seats;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if((year>1902)&&(year<2022)){
            this.year = year;
        }

    }

    public long getHours() {
        return hours;
    }

    public void setHours(long hours) {
        if((hours>=0)&&(hours<=10000))
        this.hours = hours;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if((weight>=10000)&&(weight<=16000))
        this.weight = weight;
    }

    public byte getWingspan() {
        return wingspan;
    }

    public void setWingspan(byte wingspan) {
        if((wingspan>=10)&&(wingspan<=45))
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if((topSpeed>=0)&&(topSpeed<=1000))
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats>=0)
        this.seats = seats;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if(cost>=0)
        this.cost = cost;
    }

    public void printInfo(Plane plane){
        System.out.println("name of model: "+ getModel());
        System.out.println("name of country: "+getCountry());
        System.out.println("year: " + getYear());
        System.out.println("hours"+getHours());
        System.out.println(isMilitary?"yes":"no");
        System.out.println("weight:"+getWeight());
        System.out.println("wingspan:"+getWingspan());
        System.out.println("topSpeed:"+getTopSpeed());
        System.out.println("Seats:"+getSeats());
        System.out.println("cost:"+getCost());
    }
}
