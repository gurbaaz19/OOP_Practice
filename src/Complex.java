public class Complex {

    private float real,imaginary;

    private static Integer size= Float.SIZE/8;

    public Complex(float real, float imaginary){
        this.real = real;
        this.imaginary=imaginary;
    }

    public Complex(float real){
        this(real,0);
    }

    public Complex(){
        this(0,0);
    }

    public void printNumber(){
        System.out.println(real+" + "+ imaginary+"i");
    }

    public static void print(String input){
        System.out.println(input);
    }

    public static Integer getSize(){
        return size;
    }

    public Complex add(Complex other){
        return new Complex(real+other.real,imaginary+other.imaginary);
    }
    public Complex add(float other){
        return new Complex(real+other,imaginary);
    }
}
