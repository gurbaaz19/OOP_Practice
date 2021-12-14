public class ExceptionHandling {
    public static void main(String args[]) {
        foo(5, 1);
    }

    public static void foo(int a, int b) {
        try {
            int c = a / b;
            System.out.println(c);
            throw new CustomException("This is my Exception");
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (CustomException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
    }
}
