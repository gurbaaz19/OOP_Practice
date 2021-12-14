import landVehicles.*;
import landVehicles.vehicles.*;

public class Test {

    public static void main(String args[]) {

        Complex z1 = new Complex(1, 2);
        Complex z2 = new Complex(5);
        Complex z3 = new Complex();

        z1.printNumber();
        z2.printNumber();
        z3.printNumber();

        Complex.print("Size: " + Complex.getSize().toString());

        Complex z4 = z1.add(z2);
        Complex z5 = z1.add(3.0f);

        z4.printNumber();
        z5.printNumber();

        Rectangle rect = new Rectangle(5, 4);
        Square square = new Square(6);

        System.out.println("Rectangle Area= " + rect.getArea());
        System.out.println("Square Area= " + square.getArea());

        rect.printDetails();
        square.printDetails();

        VehicleClass v1 = new Car();
        VehicleClass v2= new Bicycle();

        System.out.println(((Car) v1).calculateMaintenanceCost());
        System.out.println(((Bicycle) v2).calculateMaintenanceCost());

        System.out.println(v1.moveForward(8));
        System.out.println(v1.moveBack(5));

    }
}
