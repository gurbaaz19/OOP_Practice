public class OuterClass {

    private static int x = 5;

    public static class StaticInnerClass{
        static int z=5;
        int a=6;
    }

    public class InnerClass implements OuterClass.InnerInterface {

        private static int x = 10;
        private static int y = 2;

        public void innerPrintMethod() {
            System.out.println("inner x = " + x);
        }

        @Override
        public void interfaceMethod() {
            System.out.println("Inner Interface Method");
        }
    }

    public interface InnerInterface{
        public void interfaceMethod();
    }

    public void outerPrintMethod() {
        System.out.println("outer x = " + x);
    }
}
