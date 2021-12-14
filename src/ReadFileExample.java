import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        try (BufferedReader objReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter objWriter = new BufferedWriter(new FileWriter(args[1]))) {
            String strCurrentLine;
            while ((strCurrentLine = objReader.readLine()) != null) {
                objWriter.write(strCurrentLine);
            }
        } catch (
                IOException e
        ) {
            e.printStackTrace();
        }
    }
}
