
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class EncodeRedaer {
    public static void main(String[] args) {
        final String fileName = "C:/temp/test.txt";

        readFile(fileName, "UTF-8");
        System.out.println();
        readFile(fileName, "windows-1251");
    }

    private static void readFile(String fileName, String charset) {
        try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName(charset));
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}