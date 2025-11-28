import java.io.*;

public class file {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String line = br.readLine();
            System.out.println("First line: " + line);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: Problem reading the file.");
        }
    }
}