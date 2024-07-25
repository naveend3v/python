package code.JavaUdemyCourse.FileClass;
import java.io.File;
public class FileClass {
    public static void main(String[] args){
        File f = new File("code/JavaUdemyCourse/FileClass");
        f.getPath();
        File flist[] = f.listFiles();
        for(File x: flist){
            System.out.println(x.getName() +  " "+ x.getPath());
        }
    }
}
