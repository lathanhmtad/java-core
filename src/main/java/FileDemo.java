import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources";

        System.out.println("FileManager.exists(path) = " + FileManager.exists(path));
        System.out.println("FileManager.isFile(path) = " + FileManager.isFile(path));
        System.out.println("FileManager.isDirectory(path) = " + FileManager.isDirectory(path));
        FileManager.createNewFile(path + "/abc.txt");
        FileManager.mkdirs(path + "/database");
        String[] names = FileManager.list(path);
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        FileManager.moveTo(path + "/abc.txt",
                path + "/database/lesson.sql");

        FileManager.delete(path + "/database/lesson.sql");
    }
}
