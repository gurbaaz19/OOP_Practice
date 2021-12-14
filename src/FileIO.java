import java.util.*;

public class FileIO {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        System.out.println(input.toUpperCase());

        s.close();
    }
}
