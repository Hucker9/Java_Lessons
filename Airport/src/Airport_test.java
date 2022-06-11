import Model.Plane;
import Service.PlaneService;

public class Airport_test {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        Plane p1 = service.create();
        Plane p2 = service.create();
        Plane p3 = service.create();
        Plane[] planes = new Plane[2];




    }
}
