public class ThreadProgram {
    public static void main(String args[]){
        Thread t = new Thread(){
            public void run(){
                System.out.println("One");
                System.out.println("Two");
                System.out.println("Three");
            }
        };

        System.out.println("Starting thread");
        t.start();
        System.out.println("Thread is going on...");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }
}
