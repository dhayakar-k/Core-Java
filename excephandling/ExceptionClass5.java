package excephandling;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionClass5 {

    public void readFile(String filePath) throws FileNotFoundException {
        try {
            final File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }
        } catch (Exception e) {
            throw new FileNotFoundException("File not found");
        }
    }

    public static void main(String[] args) {
        final ExceptionClass5 ec = new ExceptionClass5();
        try {
            ec.readFile("D:\\NFR_Issues\\file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block execution");
        }

    }
}
