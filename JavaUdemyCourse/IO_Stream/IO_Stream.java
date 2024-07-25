package code.JavaUdemyCourse.IO_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class IO_Stream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1 = new FileInputStream("C:/Users/test/Documents/github/code/JavaUdemyCourse/IO_Stream/source1.txt");
        FileInputStream fis2 = new FileInputStream("C:/Users/test/Documents/github/code/JavaUdemyCourse/IO_Stream/source2.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        try (FileOutputStream fos = new FileOutputStream("C:/Users/test/Documents/github/code/JavaUdemyCourse/IO_Stream/Destination.txt")) {
            int i = 0;
            while ((i = sis.read()) != -1) {
                char ch = (char)i;
                System.out.print(ch);
                fos.write(ch);
            }
        } catch (Exception e) {
        }
        fis1.close();
        fis2.close();
    }
}
