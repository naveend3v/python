package code.JavaUdemyCourse.Random_Access_File;
import java.io.RandomAccessFile;
public class Random_Access_File {
    public static void main(String[] args) throws Exception{
        RandomAccessFile ras = new RandomAccessFile("code/JavaUdemyCourse/Random_Access_File/test.txt","rw");
        System.out.print((char)ras.read()); //A
        System.out.print((char)ras.read()); //B
        System.out.print((char)ras.read()); //C
        ras.writeBytes("d");         //d
        System.out.print(ras.getFilePointer());  //4
        System.out.print((char)ras.read()); //E
        System.out.print((char)ras.read()); //F
        ras.seek(0);
        System.out.println((char)ras.read()); //C
    }
}
