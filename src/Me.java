public class Me {
    public static void main(String[] args){
        A ob1 = new B();
        A ob2 = new A();

        ob2.iamA();
        ob1.iamA();
        ((B)ob1).iamB();
    }
}