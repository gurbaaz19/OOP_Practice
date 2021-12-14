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
        VehicleClass v2 = new Bicycle();

        System.out.println(((Car) v1).calculateMaintenanceCost());
        System.out.println(((Bicycle) v2).calculateMaintenanceCost());

        System.out.println(v1.moveForward(8));
        System.out.println(v1.moveBack(5));

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.innerPrintMethod();
        outer.outerPrintMethod();
        inner.interfaceMethod();

        VehicleClass v3 = new VehicleClass() {
            @Override
            public int moveForward(int steps) {
                return super.moveForward(steps * 2);
            }
        };

        System.out.println(v3.moveForward(2));
        System.out.println(OuterClass.StaticInnerClass.z);

        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        System.out.println(staticInner.a);

        class LocalInnerClass {
            public void bar() {
                System.out.println("bar");
            }
        }
        ;

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.bar();

        Float obj = new Float(8);
        Class cls = obj.getClass();

        System.out.println(cls);

        Batch batch = new Batch();
        Student student = null;
        try{
            findStudent(batch, student);
        }catch(CustomException e){
            System.out.println(e);
        }

    }

    public static Student findStudent (Batch batch, Student student) throws CustomException{
        try{return batch.getStudent(student);}
        catch(NullPointerException e){
            throw new CustomException("Student Not Found");
        }
    }
}
