import java.io.*;
import java.util.*;

public class FileIO {
    public static void main(String args[]) throws IOException {
//        Scanner s = new Scanner(System.in);
//
//        String input = s.nextLine();
//
//        System.out.println(input.toUpperCase());
//
//        s.close();


//        InputStreamReader i = new InputStreamReader(System.in);
//
//        System.out.println((char)i.read());


//        FileReader reader = new FileReader("src\\input.txt");
//        for (int i = 0; i < 5; i++)
//            System.out.print((char) reader.read());
//        System.out.println("");


//        File f = new File("src\\input.txt");
//
//        System.out.println(f.isFile());
//        System.out.println(f.isDirectory());
//        System.out.println(f.canRead());
//        System.out.println(f.lastModified());






//        BufferedReader br = new BufferedReader(new FileReader("src\\input.txt"));
//        String input = br.readLine();
//        System.out.println(input);
//        input = br.readLine();
//        System.out.println(input);
//        input = br.readLine();
//        System.out.println(input);

        BufferedWriter bWriter=new BufferedWriter(new FileWriter("src\\output.txt"));
        bWriter.write("Gurbaaz is a good boy.\n");
        bWriter.flush();
    }
}
