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

        Rectangle rect= new Rectangle(5,4);
        Square square=new Square(6);

        System.out.println("Rectangle Area= " + rect.getArea());
        System.out.println("Square Area= " + square.getArea());

        rect.printDetails();
        square.printDetails();
    }
}
